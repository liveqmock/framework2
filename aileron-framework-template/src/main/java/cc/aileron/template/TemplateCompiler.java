/**
 * Copyright (C) 2008 aileron.cc
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at
 * 
 * http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 */
package cc.aileron.template;

import cc.aileron.template.compiler.TemplateCompilerImpl;
import cc.aileron.template.parser.ParserMethodNotFoundException;
import cc.aileron.template.reader.TemplateSyntaxEexception;

import com.google.inject.ImplementedBy;

/**
 * 
 * テンプレートコンパイラ
 * 
 * @author Aileron
 */
@ImplementedBy(TemplateCompilerImpl.class)
public interface TemplateCompiler
{
    /**
     * @param charSequence
     * @return コンパイル済テンプレート
     * @throws ParserMethodNotFoundException
     * @throws TemplateSyntaxEexception
     */
    Template compile(CharSequence charSequence)
            throws TemplateSyntaxEexception, ParserMethodNotFoundException;
}
