// Generated from GlacierParser.g4 by ANTLR 4.8
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link GlacierParser}.
 */
public interface GlacierParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link GlacierParser#module}.
	 * @param ctx the parse tree
	 */
	void enterModule(GlacierParser.ModuleContext ctx);
	/**
	 * Exit a parse tree produced by {@link GlacierParser#module}.
	 * @param ctx the parse tree
	 */
	void exitModule(GlacierParser.ModuleContext ctx);
	/**
	 * Enter a parse tree produced by {@link GlacierParser#module_content}.
	 * @param ctx the parse tree
	 */
	void enterModule_content(GlacierParser.Module_contentContext ctx);
	/**
	 * Exit a parse tree produced by {@link GlacierParser#module_content}.
	 * @param ctx the parse tree
	 */
	void exitModule_content(GlacierParser.Module_contentContext ctx);
	/**
	 * Enter a parse tree produced by {@link GlacierParser#where_module}.
	 * @param ctx the parse tree
	 */
	void enterWhere_module(GlacierParser.Where_moduleContext ctx);
	/**
	 * Exit a parse tree produced by {@link GlacierParser#where_module}.
	 * @param ctx the parse tree
	 */
	void exitWhere_module(GlacierParser.Where_moduleContext ctx);
	/**
	 * Enter a parse tree produced by {@link GlacierParser#module_body}.
	 * @param ctx the parse tree
	 */
	void enterModule_body(GlacierParser.Module_bodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link GlacierParser#module_body}.
	 * @param ctx the parse tree
	 */
	void exitModule_body(GlacierParser.Module_bodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link GlacierParser#pragmas}.
	 * @param ctx the parse tree
	 */
	void enterPragmas(GlacierParser.PragmasContext ctx);
	/**
	 * Exit a parse tree produced by {@link GlacierParser#pragmas}.
	 * @param ctx the parse tree
	 */
	void exitPragmas(GlacierParser.PragmasContext ctx);
	/**
	 * Enter a parse tree produced by {@link GlacierParser#pragma}.
	 * @param ctx the parse tree
	 */
	void enterPragma(GlacierParser.PragmaContext ctx);
	/**
	 * Exit a parse tree produced by {@link GlacierParser#pragma}.
	 * @param ctx the parse tree
	 */
	void exitPragma(GlacierParser.PragmaContext ctx);
	/**
	 * Enter a parse tree produced by {@link GlacierParser#language_pragma}.
	 * @param ctx the parse tree
	 */
	void enterLanguage_pragma(GlacierParser.Language_pragmaContext ctx);
	/**
	 * Exit a parse tree produced by {@link GlacierParser#language_pragma}.
	 * @param ctx the parse tree
	 */
	void exitLanguage_pragma(GlacierParser.Language_pragmaContext ctx);
	/**
	 * Enter a parse tree produced by {@link GlacierParser#options_ghc}.
	 * @param ctx the parse tree
	 */
	void enterOptions_ghc(GlacierParser.Options_ghcContext ctx);
	/**
	 * Exit a parse tree produced by {@link GlacierParser#options_ghc}.
	 * @param ctx the parse tree
	 */
	void exitOptions_ghc(GlacierParser.Options_ghcContext ctx);
	/**
	 * Enter a parse tree produced by {@link GlacierParser#simple_options}.
	 * @param ctx the parse tree
	 */
	void enterSimple_options(GlacierParser.Simple_optionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link GlacierParser#simple_options}.
	 * @param ctx the parse tree
	 */
	void exitSimple_options(GlacierParser.Simple_optionsContext ctx);
	/**
	 * Enter a parse tree produced by {@link GlacierParser#extension}.
	 * @param ctx the parse tree
	 */
	void enterExtension(GlacierParser.ExtensionContext ctx);
	/**
	 * Exit a parse tree produced by {@link GlacierParser#extension}.
	 * @param ctx the parse tree
	 */
	void exitExtension(GlacierParser.ExtensionContext ctx);
	/**
	 * Enter a parse tree produced by {@link GlacierParser#body}.
	 * @param ctx the parse tree
	 */
	void enterBody(GlacierParser.BodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link GlacierParser#body}.
	 * @param ctx the parse tree
	 */
	void exitBody(GlacierParser.BodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link GlacierParser#impdecls}.
	 * @param ctx the parse tree
	 */
	void enterImpdecls(GlacierParser.ImpdeclsContext ctx);
	/**
	 * Exit a parse tree produced by {@link GlacierParser#impdecls}.
	 * @param ctx the parse tree
	 */
	void exitImpdecls(GlacierParser.ImpdeclsContext ctx);
	/**
	 * Enter a parse tree produced by {@link GlacierParser#exports}.
	 * @param ctx the parse tree
	 */
	void enterExports(GlacierParser.ExportsContext ctx);
	/**
	 * Exit a parse tree produced by {@link GlacierParser#exports}.
	 * @param ctx the parse tree
	 */
	void exitExports(GlacierParser.ExportsContext ctx);
	/**
	 * Enter a parse tree produced by {@link GlacierParser#exprt}.
	 * @param ctx the parse tree
	 */
	void enterExprt(GlacierParser.ExprtContext ctx);
	/**
	 * Exit a parse tree produced by {@link GlacierParser#exprt}.
	 * @param ctx the parse tree
	 */
	void exitExprt(GlacierParser.ExprtContext ctx);
	/**
	 * Enter a parse tree produced by {@link GlacierParser#impdecl}.
	 * @param ctx the parse tree
	 */
	void enterImpdecl(GlacierParser.ImpdeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link GlacierParser#impdecl}.
	 * @param ctx the parse tree
	 */
	void exitImpdecl(GlacierParser.ImpdeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link GlacierParser#impspec}.
	 * @param ctx the parse tree
	 */
	void enterImpspec(GlacierParser.ImpspecContext ctx);
	/**
	 * Exit a parse tree produced by {@link GlacierParser#impspec}.
	 * @param ctx the parse tree
	 */
	void exitImpspec(GlacierParser.ImpspecContext ctx);
	/**
	 * Enter a parse tree produced by {@link GlacierParser#himport}.
	 * @param ctx the parse tree
	 */
	void enterHimport(GlacierParser.HimportContext ctx);
	/**
	 * Exit a parse tree produced by {@link GlacierParser#himport}.
	 * @param ctx the parse tree
	 */
	void exitHimport(GlacierParser.HimportContext ctx);
	/**
	 * Enter a parse tree produced by {@link GlacierParser#cname}.
	 * @param ctx the parse tree
	 */
	void enterCname(GlacierParser.CnameContext ctx);
	/**
	 * Exit a parse tree produced by {@link GlacierParser#cname}.
	 * @param ctx the parse tree
	 */
	void exitCname(GlacierParser.CnameContext ctx);
	/**
	 * Enter a parse tree produced by {@link GlacierParser#fixity}.
	 * @param ctx the parse tree
	 */
	void enterFixity(GlacierParser.FixityContext ctx);
	/**
	 * Exit a parse tree produced by {@link GlacierParser#fixity}.
	 * @param ctx the parse tree
	 */
	void exitFixity(GlacierParser.FixityContext ctx);
	/**
	 * Enter a parse tree produced by {@link GlacierParser#ops}.
	 * @param ctx the parse tree
	 */
	void enterOps(GlacierParser.OpsContext ctx);
	/**
	 * Exit a parse tree produced by {@link GlacierParser#ops}.
	 * @param ctx the parse tree
	 */
	void exitOps(GlacierParser.OpsContext ctx);
	/**
	 * Enter a parse tree produced by {@link GlacierParser#topdecls}.
	 * @param ctx the parse tree
	 */
	void enterTopdecls(GlacierParser.TopdeclsContext ctx);
	/**
	 * Exit a parse tree produced by {@link GlacierParser#topdecls}.
	 * @param ctx the parse tree
	 */
	void exitTopdecls(GlacierParser.TopdeclsContext ctx);
	/**
	 * Enter a parse tree produced by {@link GlacierParser#topdecl}.
	 * @param ctx the parse tree
	 */
	void enterTopdecl(GlacierParser.TopdeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link GlacierParser#topdecl}.
	 * @param ctx the parse tree
	 */
	void exitTopdecl(GlacierParser.TopdeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link GlacierParser#cl_decl}.
	 * @param ctx the parse tree
	 */
	void enterCl_decl(GlacierParser.Cl_declContext ctx);
	/**
	 * Exit a parse tree produced by {@link GlacierParser#cl_decl}.
	 * @param ctx the parse tree
	 */
	void exitCl_decl(GlacierParser.Cl_declContext ctx);
	/**
	 * Enter a parse tree produced by {@link GlacierParser#ty_decl}.
	 * @param ctx the parse tree
	 */
	void enterTy_decl(GlacierParser.Ty_declContext ctx);
	/**
	 * Exit a parse tree produced by {@link GlacierParser#ty_decl}.
	 * @param ctx the parse tree
	 */
	void exitTy_decl(GlacierParser.Ty_declContext ctx);
	/**
	 * Enter a parse tree produced by {@link GlacierParser#standalone_kind_sig}.
	 * @param ctx the parse tree
	 */
	void enterStandalone_kind_sig(GlacierParser.Standalone_kind_sigContext ctx);
	/**
	 * Exit a parse tree produced by {@link GlacierParser#standalone_kind_sig}.
	 * @param ctx the parse tree
	 */
	void exitStandalone_kind_sig(GlacierParser.Standalone_kind_sigContext ctx);
	/**
	 * Enter a parse tree produced by {@link GlacierParser#sks_vars}.
	 * @param ctx the parse tree
	 */
	void enterSks_vars(GlacierParser.Sks_varsContext ctx);
	/**
	 * Exit a parse tree produced by {@link GlacierParser#sks_vars}.
	 * @param ctx the parse tree
	 */
	void exitSks_vars(GlacierParser.Sks_varsContext ctx);
	/**
	 * Enter a parse tree produced by {@link GlacierParser#inst_decl}.
	 * @param ctx the parse tree
	 */
	void enterInst_decl(GlacierParser.Inst_declContext ctx);
	/**
	 * Exit a parse tree produced by {@link GlacierParser#inst_decl}.
	 * @param ctx the parse tree
	 */
	void exitInst_decl(GlacierParser.Inst_declContext ctx);
	/**
	 * Enter a parse tree produced by {@link GlacierParser#overlap_pragma}.
	 * @param ctx the parse tree
	 */
	void enterOverlap_pragma(GlacierParser.Overlap_pragmaContext ctx);
	/**
	 * Exit a parse tree produced by {@link GlacierParser#overlap_pragma}.
	 * @param ctx the parse tree
	 */
	void exitOverlap_pragma(GlacierParser.Overlap_pragmaContext ctx);
	/**
	 * Enter a parse tree produced by {@link GlacierParser#deriv_strategy_no_via}.
	 * @param ctx the parse tree
	 */
	void enterDeriv_strategy_no_via(GlacierParser.Deriv_strategy_no_viaContext ctx);
	/**
	 * Exit a parse tree produced by {@link GlacierParser#deriv_strategy_no_via}.
	 * @param ctx the parse tree
	 */
	void exitDeriv_strategy_no_via(GlacierParser.Deriv_strategy_no_viaContext ctx);
	/**
	 * Enter a parse tree produced by {@link GlacierParser#deriv_strategy_via}.
	 * @param ctx the parse tree
	 */
	void enterDeriv_strategy_via(GlacierParser.Deriv_strategy_viaContext ctx);
	/**
	 * Exit a parse tree produced by {@link GlacierParser#deriv_strategy_via}.
	 * @param ctx the parse tree
	 */
	void exitDeriv_strategy_via(GlacierParser.Deriv_strategy_viaContext ctx);
	/**
	 * Enter a parse tree produced by {@link GlacierParser#deriv_standalone_strategy}.
	 * @param ctx the parse tree
	 */
	void enterDeriv_standalone_strategy(GlacierParser.Deriv_standalone_strategyContext ctx);
	/**
	 * Exit a parse tree produced by {@link GlacierParser#deriv_standalone_strategy}.
	 * @param ctx the parse tree
	 */
	void exitDeriv_standalone_strategy(GlacierParser.Deriv_standalone_strategyContext ctx);
	/**
	 * Enter a parse tree produced by {@link GlacierParser#opt_injective_info}.
	 * @param ctx the parse tree
	 */
	void enterOpt_injective_info(GlacierParser.Opt_injective_infoContext ctx);
	/**
	 * Exit a parse tree produced by {@link GlacierParser#opt_injective_info}.
	 * @param ctx the parse tree
	 */
	void exitOpt_injective_info(GlacierParser.Opt_injective_infoContext ctx);
	/**
	 * Enter a parse tree produced by {@link GlacierParser#injectivity_cond}.
	 * @param ctx the parse tree
	 */
	void enterInjectivity_cond(GlacierParser.Injectivity_condContext ctx);
	/**
	 * Exit a parse tree produced by {@link GlacierParser#injectivity_cond}.
	 * @param ctx the parse tree
	 */
	void exitInjectivity_cond(GlacierParser.Injectivity_condContext ctx);
	/**
	 * Enter a parse tree produced by {@link GlacierParser#inj_varids}.
	 * @param ctx the parse tree
	 */
	void enterInj_varids(GlacierParser.Inj_varidsContext ctx);
	/**
	 * Exit a parse tree produced by {@link GlacierParser#inj_varids}.
	 * @param ctx the parse tree
	 */
	void exitInj_varids(GlacierParser.Inj_varidsContext ctx);
	/**
	 * Enter a parse tree produced by {@link GlacierParser#where_type_family}.
	 * @param ctx the parse tree
	 */
	void enterWhere_type_family(GlacierParser.Where_type_familyContext ctx);
	/**
	 * Exit a parse tree produced by {@link GlacierParser#where_type_family}.
	 * @param ctx the parse tree
	 */
	void exitWhere_type_family(GlacierParser.Where_type_familyContext ctx);
	/**
	 * Enter a parse tree produced by {@link GlacierParser#ty_fam_inst_eqn_list}.
	 * @param ctx the parse tree
	 */
	void enterTy_fam_inst_eqn_list(GlacierParser.Ty_fam_inst_eqn_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link GlacierParser#ty_fam_inst_eqn_list}.
	 * @param ctx the parse tree
	 */
	void exitTy_fam_inst_eqn_list(GlacierParser.Ty_fam_inst_eqn_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link GlacierParser#ty_fam_inst_eqns}.
	 * @param ctx the parse tree
	 */
	void enterTy_fam_inst_eqns(GlacierParser.Ty_fam_inst_eqnsContext ctx);
	/**
	 * Exit a parse tree produced by {@link GlacierParser#ty_fam_inst_eqns}.
	 * @param ctx the parse tree
	 */
	void exitTy_fam_inst_eqns(GlacierParser.Ty_fam_inst_eqnsContext ctx);
	/**
	 * Enter a parse tree produced by {@link GlacierParser#ty_fam_inst_eqn}.
	 * @param ctx the parse tree
	 */
	void enterTy_fam_inst_eqn(GlacierParser.Ty_fam_inst_eqnContext ctx);
	/**
	 * Exit a parse tree produced by {@link GlacierParser#ty_fam_inst_eqn}.
	 * @param ctx the parse tree
	 */
	void exitTy_fam_inst_eqn(GlacierParser.Ty_fam_inst_eqnContext ctx);
	/**
	 * Enter a parse tree produced by {@link GlacierParser#at_decl_cls}.
	 * @param ctx the parse tree
	 */
	void enterAt_decl_cls(GlacierParser.At_decl_clsContext ctx);
	/**
	 * Exit a parse tree produced by {@link GlacierParser#at_decl_cls}.
	 * @param ctx the parse tree
	 */
	void exitAt_decl_cls(GlacierParser.At_decl_clsContext ctx);
	/**
	 * Enter a parse tree produced by {@link GlacierParser#at_decl_inst}.
	 * @param ctx the parse tree
	 */
	void enterAt_decl_inst(GlacierParser.At_decl_instContext ctx);
	/**
	 * Exit a parse tree produced by {@link GlacierParser#at_decl_inst}.
	 * @param ctx the parse tree
	 */
	void exitAt_decl_inst(GlacierParser.At_decl_instContext ctx);
	/**
	 * Enter a parse tree produced by {@link GlacierParser#opt_kind_sig}.
	 * @param ctx the parse tree
	 */
	void enterOpt_kind_sig(GlacierParser.Opt_kind_sigContext ctx);
	/**
	 * Exit a parse tree produced by {@link GlacierParser#opt_kind_sig}.
	 * @param ctx the parse tree
	 */
	void exitOpt_kind_sig(GlacierParser.Opt_kind_sigContext ctx);
	/**
	 * Enter a parse tree produced by {@link GlacierParser#opt_datafam_kind_sig}.
	 * @param ctx the parse tree
	 */
	void enterOpt_datafam_kind_sig(GlacierParser.Opt_datafam_kind_sigContext ctx);
	/**
	 * Exit a parse tree produced by {@link GlacierParser#opt_datafam_kind_sig}.
	 * @param ctx the parse tree
	 */
	void exitOpt_datafam_kind_sig(GlacierParser.Opt_datafam_kind_sigContext ctx);
	/**
	 * Enter a parse tree produced by {@link GlacierParser#opt_tyfam_kind_sig}.
	 * @param ctx the parse tree
	 */
	void enterOpt_tyfam_kind_sig(GlacierParser.Opt_tyfam_kind_sigContext ctx);
	/**
	 * Exit a parse tree produced by {@link GlacierParser#opt_tyfam_kind_sig}.
	 * @param ctx the parse tree
	 */
	void exitOpt_tyfam_kind_sig(GlacierParser.Opt_tyfam_kind_sigContext ctx);
	/**
	 * Enter a parse tree produced by {@link GlacierParser#opt_at_kind_inj_sig}.
	 * @param ctx the parse tree
	 */
	void enterOpt_at_kind_inj_sig(GlacierParser.Opt_at_kind_inj_sigContext ctx);
	/**
	 * Exit a parse tree produced by {@link GlacierParser#opt_at_kind_inj_sig}.
	 * @param ctx the parse tree
	 */
	void exitOpt_at_kind_inj_sig(GlacierParser.Opt_at_kind_inj_sigContext ctx);
	/**
	 * Enter a parse tree produced by {@link GlacierParser#tycl_hdr}.
	 * @param ctx the parse tree
	 */
	void enterTycl_hdr(GlacierParser.Tycl_hdrContext ctx);
	/**
	 * Exit a parse tree produced by {@link GlacierParser#tycl_hdr}.
	 * @param ctx the parse tree
	 */
	void exitTycl_hdr(GlacierParser.Tycl_hdrContext ctx);
	/**
	 * Enter a parse tree produced by {@link GlacierParser#tycl_hdr_inst}.
	 * @param ctx the parse tree
	 */
	void enterTycl_hdr_inst(GlacierParser.Tycl_hdr_instContext ctx);
	/**
	 * Exit a parse tree produced by {@link GlacierParser#tycl_hdr_inst}.
	 * @param ctx the parse tree
	 */
	void exitTycl_hdr_inst(GlacierParser.Tycl_hdr_instContext ctx);
	/**
	 * Enter a parse tree produced by {@link GlacierParser#capi_ctype}.
	 * @param ctx the parse tree
	 */
	void enterCapi_ctype(GlacierParser.Capi_ctypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link GlacierParser#capi_ctype}.
	 * @param ctx the parse tree
	 */
	void exitCapi_ctype(GlacierParser.Capi_ctypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link GlacierParser#standalone_deriving}.
	 * @param ctx the parse tree
	 */
	void enterStandalone_deriving(GlacierParser.Standalone_derivingContext ctx);
	/**
	 * Exit a parse tree produced by {@link GlacierParser#standalone_deriving}.
	 * @param ctx the parse tree
	 */
	void exitStandalone_deriving(GlacierParser.Standalone_derivingContext ctx);
	/**
	 * Enter a parse tree produced by {@link GlacierParser#role_annot}.
	 * @param ctx the parse tree
	 */
	void enterRole_annot(GlacierParser.Role_annotContext ctx);
	/**
	 * Exit a parse tree produced by {@link GlacierParser#role_annot}.
	 * @param ctx the parse tree
	 */
	void exitRole_annot(GlacierParser.Role_annotContext ctx);
	/**
	 * Enter a parse tree produced by {@link GlacierParser#roles}.
	 * @param ctx the parse tree
	 */
	void enterRoles(GlacierParser.RolesContext ctx);
	/**
	 * Exit a parse tree produced by {@link GlacierParser#roles}.
	 * @param ctx the parse tree
	 */
	void exitRoles(GlacierParser.RolesContext ctx);
	/**
	 * Enter a parse tree produced by {@link GlacierParser#role}.
	 * @param ctx the parse tree
	 */
	void enterRole(GlacierParser.RoleContext ctx);
	/**
	 * Exit a parse tree produced by {@link GlacierParser#role}.
	 * @param ctx the parse tree
	 */
	void exitRole(GlacierParser.RoleContext ctx);
	/**
	 * Enter a parse tree produced by {@link GlacierParser#pattern_synonym_decl}.
	 * @param ctx the parse tree
	 */
	void enterPattern_synonym_decl(GlacierParser.Pattern_synonym_declContext ctx);
	/**
	 * Exit a parse tree produced by {@link GlacierParser#pattern_synonym_decl}.
	 * @param ctx the parse tree
	 */
	void exitPattern_synonym_decl(GlacierParser.Pattern_synonym_declContext ctx);
	/**
	 * Enter a parse tree produced by {@link GlacierParser#pattern_synonym_lhs}.
	 * @param ctx the parse tree
	 */
	void enterPattern_synonym_lhs(GlacierParser.Pattern_synonym_lhsContext ctx);
	/**
	 * Exit a parse tree produced by {@link GlacierParser#pattern_synonym_lhs}.
	 * @param ctx the parse tree
	 */
	void exitPattern_synonym_lhs(GlacierParser.Pattern_synonym_lhsContext ctx);
	/**
	 * Enter a parse tree produced by {@link GlacierParser#vars_hs}.
	 * @param ctx the parse tree
	 */
	void enterVars_hs(GlacierParser.Vars_hsContext ctx);
	/**
	 * Exit a parse tree produced by {@link GlacierParser#vars_hs}.
	 * @param ctx the parse tree
	 */
	void exitVars_hs(GlacierParser.Vars_hsContext ctx);
	/**
	 * Enter a parse tree produced by {@link GlacierParser#cvars}.
	 * @param ctx the parse tree
	 */
	void enterCvars(GlacierParser.CvarsContext ctx);
	/**
	 * Exit a parse tree produced by {@link GlacierParser#cvars}.
	 * @param ctx the parse tree
	 */
	void exitCvars(GlacierParser.CvarsContext ctx);
	/**
	 * Enter a parse tree produced by {@link GlacierParser#where_decls}.
	 * @param ctx the parse tree
	 */
	void enterWhere_decls(GlacierParser.Where_declsContext ctx);
	/**
	 * Exit a parse tree produced by {@link GlacierParser#where_decls}.
	 * @param ctx the parse tree
	 */
	void exitWhere_decls(GlacierParser.Where_declsContext ctx);
	/**
	 * Enter a parse tree produced by {@link GlacierParser#pattern_synonym_sig}.
	 * @param ctx the parse tree
	 */
	void enterPattern_synonym_sig(GlacierParser.Pattern_synonym_sigContext ctx);
	/**
	 * Exit a parse tree produced by {@link GlacierParser#pattern_synonym_sig}.
	 * @param ctx the parse tree
	 */
	void exitPattern_synonym_sig(GlacierParser.Pattern_synonym_sigContext ctx);
	/**
	 * Enter a parse tree produced by {@link GlacierParser#decl_cls}.
	 * @param ctx the parse tree
	 */
	void enterDecl_cls(GlacierParser.Decl_clsContext ctx);
	/**
	 * Exit a parse tree produced by {@link GlacierParser#decl_cls}.
	 * @param ctx the parse tree
	 */
	void exitDecl_cls(GlacierParser.Decl_clsContext ctx);
	/**
	 * Enter a parse tree produced by {@link GlacierParser#decls_cls}.
	 * @param ctx the parse tree
	 */
	void enterDecls_cls(GlacierParser.Decls_clsContext ctx);
	/**
	 * Exit a parse tree produced by {@link GlacierParser#decls_cls}.
	 * @param ctx the parse tree
	 */
	void exitDecls_cls(GlacierParser.Decls_clsContext ctx);
	/**
	 * Enter a parse tree produced by {@link GlacierParser#decllist_cls}.
	 * @param ctx the parse tree
	 */
	void enterDecllist_cls(GlacierParser.Decllist_clsContext ctx);
	/**
	 * Exit a parse tree produced by {@link GlacierParser#decllist_cls}.
	 * @param ctx the parse tree
	 */
	void exitDecllist_cls(GlacierParser.Decllist_clsContext ctx);
	/**
	 * Enter a parse tree produced by {@link GlacierParser#where_cls}.
	 * @param ctx the parse tree
	 */
	void enterWhere_cls(GlacierParser.Where_clsContext ctx);
	/**
	 * Exit a parse tree produced by {@link GlacierParser#where_cls}.
	 * @param ctx the parse tree
	 */
	void exitWhere_cls(GlacierParser.Where_clsContext ctx);
	/**
	 * Enter a parse tree produced by {@link GlacierParser#decl_inst}.
	 * @param ctx the parse tree
	 */
	void enterDecl_inst(GlacierParser.Decl_instContext ctx);
	/**
	 * Exit a parse tree produced by {@link GlacierParser#decl_inst}.
	 * @param ctx the parse tree
	 */
	void exitDecl_inst(GlacierParser.Decl_instContext ctx);
	/**
	 * Enter a parse tree produced by {@link GlacierParser#decls_inst}.
	 * @param ctx the parse tree
	 */
	void enterDecls_inst(GlacierParser.Decls_instContext ctx);
	/**
	 * Exit a parse tree produced by {@link GlacierParser#decls_inst}.
	 * @param ctx the parse tree
	 */
	void exitDecls_inst(GlacierParser.Decls_instContext ctx);
	/**
	 * Enter a parse tree produced by {@link GlacierParser#decllist_inst}.
	 * @param ctx the parse tree
	 */
	void enterDecllist_inst(GlacierParser.Decllist_instContext ctx);
	/**
	 * Exit a parse tree produced by {@link GlacierParser#decllist_inst}.
	 * @param ctx the parse tree
	 */
	void exitDecllist_inst(GlacierParser.Decllist_instContext ctx);
	/**
	 * Enter a parse tree produced by {@link GlacierParser#where_inst}.
	 * @param ctx the parse tree
	 */
	void enterWhere_inst(GlacierParser.Where_instContext ctx);
	/**
	 * Exit a parse tree produced by {@link GlacierParser#where_inst}.
	 * @param ctx the parse tree
	 */
	void exitWhere_inst(GlacierParser.Where_instContext ctx);
	/**
	 * Enter a parse tree produced by {@link GlacierParser#decls}.
	 * @param ctx the parse tree
	 */
	void enterDecls(GlacierParser.DeclsContext ctx);
	/**
	 * Exit a parse tree produced by {@link GlacierParser#decls}.
	 * @param ctx the parse tree
	 */
	void exitDecls(GlacierParser.DeclsContext ctx);
	/**
	 * Enter a parse tree produced by {@link GlacierParser#decllist}.
	 * @param ctx the parse tree
	 */
	void enterDecllist(GlacierParser.DecllistContext ctx);
	/**
	 * Exit a parse tree produced by {@link GlacierParser#decllist}.
	 * @param ctx the parse tree
	 */
	void exitDecllist(GlacierParser.DecllistContext ctx);
	/**
	 * Enter a parse tree produced by {@link GlacierParser#binds}.
	 * @param ctx the parse tree
	 */
	void enterBinds(GlacierParser.BindsContext ctx);
	/**
	 * Exit a parse tree produced by {@link GlacierParser#binds}.
	 * @param ctx the parse tree
	 */
	void exitBinds(GlacierParser.BindsContext ctx);
	/**
	 * Enter a parse tree produced by {@link GlacierParser#wherebinds}.
	 * @param ctx the parse tree
	 */
	void enterWherebinds(GlacierParser.WherebindsContext ctx);
	/**
	 * Exit a parse tree produced by {@link GlacierParser#wherebinds}.
	 * @param ctx the parse tree
	 */
	void exitWherebinds(GlacierParser.WherebindsContext ctx);
	/**
	 * Enter a parse tree produced by {@link GlacierParser#rules}.
	 * @param ctx the parse tree
	 */
	void enterRules(GlacierParser.RulesContext ctx);
	/**
	 * Exit a parse tree produced by {@link GlacierParser#rules}.
	 * @param ctx the parse tree
	 */
	void exitRules(GlacierParser.RulesContext ctx);
	/**
	 * Enter a parse tree produced by {@link GlacierParser#pragma_rule}.
	 * @param ctx the parse tree
	 */
	void enterPragma_rule(GlacierParser.Pragma_ruleContext ctx);
	/**
	 * Exit a parse tree produced by {@link GlacierParser#pragma_rule}.
	 * @param ctx the parse tree
	 */
	void exitPragma_rule(GlacierParser.Pragma_ruleContext ctx);
	/**
	 * Enter a parse tree produced by {@link GlacierParser#rule_activation_marker}.
	 * @param ctx the parse tree
	 */
	void enterRule_activation_marker(GlacierParser.Rule_activation_markerContext ctx);
	/**
	 * Exit a parse tree produced by {@link GlacierParser#rule_activation_marker}.
	 * @param ctx the parse tree
	 */
	void exitRule_activation_marker(GlacierParser.Rule_activation_markerContext ctx);
	/**
	 * Enter a parse tree produced by {@link GlacierParser#rule_activation}.
	 * @param ctx the parse tree
	 */
	void enterRule_activation(GlacierParser.Rule_activationContext ctx);
	/**
	 * Exit a parse tree produced by {@link GlacierParser#rule_activation}.
	 * @param ctx the parse tree
	 */
	void exitRule_activation(GlacierParser.Rule_activationContext ctx);
	/**
	 * Enter a parse tree produced by {@link GlacierParser#rule_foralls}.
	 * @param ctx the parse tree
	 */
	void enterRule_foralls(GlacierParser.Rule_forallsContext ctx);
	/**
	 * Exit a parse tree produced by {@link GlacierParser#rule_foralls}.
	 * @param ctx the parse tree
	 */
	void exitRule_foralls(GlacierParser.Rule_forallsContext ctx);
	/**
	 * Enter a parse tree produced by {@link GlacierParser#rule_vars}.
	 * @param ctx the parse tree
	 */
	void enterRule_vars(GlacierParser.Rule_varsContext ctx);
	/**
	 * Exit a parse tree produced by {@link GlacierParser#rule_vars}.
	 * @param ctx the parse tree
	 */
	void exitRule_vars(GlacierParser.Rule_varsContext ctx);
	/**
	 * Enter a parse tree produced by {@link GlacierParser#rule_var}.
	 * @param ctx the parse tree
	 */
	void enterRule_var(GlacierParser.Rule_varContext ctx);
	/**
	 * Exit a parse tree produced by {@link GlacierParser#rule_var}.
	 * @param ctx the parse tree
	 */
	void exitRule_var(GlacierParser.Rule_varContext ctx);
	/**
	 * Enter a parse tree produced by {@link GlacierParser#warnings}.
	 * @param ctx the parse tree
	 */
	void enterWarnings(GlacierParser.WarningsContext ctx);
	/**
	 * Exit a parse tree produced by {@link GlacierParser#warnings}.
	 * @param ctx the parse tree
	 */
	void exitWarnings(GlacierParser.WarningsContext ctx);
	/**
	 * Enter a parse tree produced by {@link GlacierParser#pragma_warning}.
	 * @param ctx the parse tree
	 */
	void enterPragma_warning(GlacierParser.Pragma_warningContext ctx);
	/**
	 * Exit a parse tree produced by {@link GlacierParser#pragma_warning}.
	 * @param ctx the parse tree
	 */
	void exitPragma_warning(GlacierParser.Pragma_warningContext ctx);
	/**
	 * Enter a parse tree produced by {@link GlacierParser#deprecations}.
	 * @param ctx the parse tree
	 */
	void enterDeprecations(GlacierParser.DeprecationsContext ctx);
	/**
	 * Exit a parse tree produced by {@link GlacierParser#deprecations}.
	 * @param ctx the parse tree
	 */
	void exitDeprecations(GlacierParser.DeprecationsContext ctx);
	/**
	 * Enter a parse tree produced by {@link GlacierParser#pragma_deprecation}.
	 * @param ctx the parse tree
	 */
	void enterPragma_deprecation(GlacierParser.Pragma_deprecationContext ctx);
	/**
	 * Exit a parse tree produced by {@link GlacierParser#pragma_deprecation}.
	 * @param ctx the parse tree
	 */
	void exitPragma_deprecation(GlacierParser.Pragma_deprecationContext ctx);
	/**
	 * Enter a parse tree produced by {@link GlacierParser#strings}.
	 * @param ctx the parse tree
	 */
	void enterStrings(GlacierParser.StringsContext ctx);
	/**
	 * Exit a parse tree produced by {@link GlacierParser#strings}.
	 * @param ctx the parse tree
	 */
	void exitStrings(GlacierParser.StringsContext ctx);
	/**
	 * Enter a parse tree produced by {@link GlacierParser#stringlist}.
	 * @param ctx the parse tree
	 */
	void enterStringlist(GlacierParser.StringlistContext ctx);
	/**
	 * Exit a parse tree produced by {@link GlacierParser#stringlist}.
	 * @param ctx the parse tree
	 */
	void exitStringlist(GlacierParser.StringlistContext ctx);
	/**
	 * Enter a parse tree produced by {@link GlacierParser#annotation}.
	 * @param ctx the parse tree
	 */
	void enterAnnotation(GlacierParser.AnnotationContext ctx);
	/**
	 * Exit a parse tree produced by {@link GlacierParser#annotation}.
	 * @param ctx the parse tree
	 */
	void exitAnnotation(GlacierParser.AnnotationContext ctx);
	/**
	 * Enter a parse tree produced by {@link GlacierParser#fdecl}.
	 * @param ctx the parse tree
	 */
	void enterFdecl(GlacierParser.FdeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link GlacierParser#fdecl}.
	 * @param ctx the parse tree
	 */
	void exitFdecl(GlacierParser.FdeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link GlacierParser#callconv}.
	 * @param ctx the parse tree
	 */
	void enterCallconv(GlacierParser.CallconvContext ctx);
	/**
	 * Exit a parse tree produced by {@link GlacierParser#callconv}.
	 * @param ctx the parse tree
	 */
	void exitCallconv(GlacierParser.CallconvContext ctx);
	/**
	 * Enter a parse tree produced by {@link GlacierParser#safety}.
	 * @param ctx the parse tree
	 */
	void enterSafety(GlacierParser.SafetyContext ctx);
	/**
	 * Exit a parse tree produced by {@link GlacierParser#safety}.
	 * @param ctx the parse tree
	 */
	void exitSafety(GlacierParser.SafetyContext ctx);
	/**
	 * Enter a parse tree produced by {@link GlacierParser#fspec}.
	 * @param ctx the parse tree
	 */
	void enterFspec(GlacierParser.FspecContext ctx);
	/**
	 * Exit a parse tree produced by {@link GlacierParser#fspec}.
	 * @param ctx the parse tree
	 */
	void exitFspec(GlacierParser.FspecContext ctx);
	/**
	 * Enter a parse tree produced by {@link GlacierParser#opt_sig}.
	 * @param ctx the parse tree
	 */
	void enterOpt_sig(GlacierParser.Opt_sigContext ctx);
	/**
	 * Exit a parse tree produced by {@link GlacierParser#opt_sig}.
	 * @param ctx the parse tree
	 */
	void exitOpt_sig(GlacierParser.Opt_sigContext ctx);
	/**
	 * Enter a parse tree produced by {@link GlacierParser#opt_tyconsig}.
	 * @param ctx the parse tree
	 */
	void enterOpt_tyconsig(GlacierParser.Opt_tyconsigContext ctx);
	/**
	 * Exit a parse tree produced by {@link GlacierParser#opt_tyconsig}.
	 * @param ctx the parse tree
	 */
	void exitOpt_tyconsig(GlacierParser.Opt_tyconsigContext ctx);
	/**
	 * Enter a parse tree produced by {@link GlacierParser#sigtype}.
	 * @param ctx the parse tree
	 */
	void enterSigtype(GlacierParser.SigtypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link GlacierParser#sigtype}.
	 * @param ctx the parse tree
	 */
	void exitSigtype(GlacierParser.SigtypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link GlacierParser#sigtypedoc}.
	 * @param ctx the parse tree
	 */
	void enterSigtypedoc(GlacierParser.SigtypedocContext ctx);
	/**
	 * Exit a parse tree produced by {@link GlacierParser#sigtypedoc}.
	 * @param ctx the parse tree
	 */
	void exitSigtypedoc(GlacierParser.SigtypedocContext ctx);
	/**
	 * Enter a parse tree produced by {@link GlacierParser#sig_vars}.
	 * @param ctx the parse tree
	 */
	void enterSig_vars(GlacierParser.Sig_varsContext ctx);
	/**
	 * Exit a parse tree produced by {@link GlacierParser#sig_vars}.
	 * @param ctx the parse tree
	 */
	void exitSig_vars(GlacierParser.Sig_varsContext ctx);
	/**
	 * Enter a parse tree produced by {@link GlacierParser#sigtypes1}.
	 * @param ctx the parse tree
	 */
	void enterSigtypes1(GlacierParser.Sigtypes1Context ctx);
	/**
	 * Exit a parse tree produced by {@link GlacierParser#sigtypes1}.
	 * @param ctx the parse tree
	 */
	void exitSigtypes1(GlacierParser.Sigtypes1Context ctx);
	/**
	 * Enter a parse tree produced by {@link GlacierParser#unpackedness}.
	 * @param ctx the parse tree
	 */
	void enterUnpackedness(GlacierParser.UnpackednessContext ctx);
	/**
	 * Exit a parse tree produced by {@link GlacierParser#unpackedness}.
	 * @param ctx the parse tree
	 */
	void exitUnpackedness(GlacierParser.UnpackednessContext ctx);
	/**
	 * Enter a parse tree produced by {@link GlacierParser#forall_vis_flag}.
	 * @param ctx the parse tree
	 */
	void enterForall_vis_flag(GlacierParser.Forall_vis_flagContext ctx);
	/**
	 * Exit a parse tree produced by {@link GlacierParser#forall_vis_flag}.
	 * @param ctx the parse tree
	 */
	void exitForall_vis_flag(GlacierParser.Forall_vis_flagContext ctx);
	/**
	 * Enter a parse tree produced by {@link GlacierParser#ktype}.
	 * @param ctx the parse tree
	 */
	void enterKtype(GlacierParser.KtypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link GlacierParser#ktype}.
	 * @param ctx the parse tree
	 */
	void exitKtype(GlacierParser.KtypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link GlacierParser#ktypedoc}.
	 * @param ctx the parse tree
	 */
	void enterKtypedoc(GlacierParser.KtypedocContext ctx);
	/**
	 * Exit a parse tree produced by {@link GlacierParser#ktypedoc}.
	 * @param ctx the parse tree
	 */
	void exitKtypedoc(GlacierParser.KtypedocContext ctx);
	/**
	 * Enter a parse tree produced by {@link GlacierParser#ctype}.
	 * @param ctx the parse tree
	 */
	void enterCtype(GlacierParser.CtypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link GlacierParser#ctype}.
	 * @param ctx the parse tree
	 */
	void exitCtype(GlacierParser.CtypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link GlacierParser#ctypedoc}.
	 * @param ctx the parse tree
	 */
	void enterCtypedoc(GlacierParser.CtypedocContext ctx);
	/**
	 * Exit a parse tree produced by {@link GlacierParser#ctypedoc}.
	 * @param ctx the parse tree
	 */
	void exitCtypedoc(GlacierParser.CtypedocContext ctx);
	/**
	 * Enter a parse tree produced by {@link GlacierParser#tycl_context}.
	 * @param ctx the parse tree
	 */
	void enterTycl_context(GlacierParser.Tycl_contextContext ctx);
	/**
	 * Exit a parse tree produced by {@link GlacierParser#tycl_context}.
	 * @param ctx the parse tree
	 */
	void exitTycl_context(GlacierParser.Tycl_contextContext ctx);
	/**
	 * Enter a parse tree produced by {@link GlacierParser#constr_context}.
	 * @param ctx the parse tree
	 */
	void enterConstr_context(GlacierParser.Constr_contextContext ctx);
	/**
	 * Exit a parse tree produced by {@link GlacierParser#constr_context}.
	 * @param ctx the parse tree
	 */
	void exitConstr_context(GlacierParser.Constr_contextContext ctx);
	/**
	 * Enter a parse tree produced by {@link GlacierParser#type_hs}.
	 * @param ctx the parse tree
	 */
	void enterType_hs(GlacierParser.Type_hsContext ctx);
	/**
	 * Exit a parse tree produced by {@link GlacierParser#type_hs}.
	 * @param ctx the parse tree
	 */
	void exitType_hs(GlacierParser.Type_hsContext ctx);
	/**
	 * Enter a parse tree produced by {@link GlacierParser#typedoc}.
	 * @param ctx the parse tree
	 */
	void enterTypedoc(GlacierParser.TypedocContext ctx);
	/**
	 * Exit a parse tree produced by {@link GlacierParser#typedoc}.
	 * @param ctx the parse tree
	 */
	void exitTypedoc(GlacierParser.TypedocContext ctx);
	/**
	 * Enter a parse tree produced by {@link GlacierParser#constr_btype}.
	 * @param ctx the parse tree
	 */
	void enterConstr_btype(GlacierParser.Constr_btypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link GlacierParser#constr_btype}.
	 * @param ctx the parse tree
	 */
	void exitConstr_btype(GlacierParser.Constr_btypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link GlacierParser#constr_tyapps}.
	 * @param ctx the parse tree
	 */
	void enterConstr_tyapps(GlacierParser.Constr_tyappsContext ctx);
	/**
	 * Exit a parse tree produced by {@link GlacierParser#constr_tyapps}.
	 * @param ctx the parse tree
	 */
	void exitConstr_tyapps(GlacierParser.Constr_tyappsContext ctx);
	/**
	 * Enter a parse tree produced by {@link GlacierParser#constr_tyapp}.
	 * @param ctx the parse tree
	 */
	void enterConstr_tyapp(GlacierParser.Constr_tyappContext ctx);
	/**
	 * Exit a parse tree produced by {@link GlacierParser#constr_tyapp}.
	 * @param ctx the parse tree
	 */
	void exitConstr_tyapp(GlacierParser.Constr_tyappContext ctx);
	/**
	 * Enter a parse tree produced by {@link GlacierParser#btype}.
	 * @param ctx the parse tree
	 */
	void enterBtype(GlacierParser.BtypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link GlacierParser#btype}.
	 * @param ctx the parse tree
	 */
	void exitBtype(GlacierParser.BtypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link GlacierParser#tyapps}.
	 * @param ctx the parse tree
	 */
	void enterTyapps(GlacierParser.TyappsContext ctx);
	/**
	 * Exit a parse tree produced by {@link GlacierParser#tyapps}.
	 * @param ctx the parse tree
	 */
	void exitTyapps(GlacierParser.TyappsContext ctx);
	/**
	 * Enter a parse tree produced by {@link GlacierParser#tyapp}.
	 * @param ctx the parse tree
	 */
	void enterTyapp(GlacierParser.TyappContext ctx);
	/**
	 * Exit a parse tree produced by {@link GlacierParser#tyapp}.
	 * @param ctx the parse tree
	 */
	void exitTyapp(GlacierParser.TyappContext ctx);
	/**
	 * Enter a parse tree produced by {@link GlacierParser#atype}.
	 * @param ctx the parse tree
	 */
	void enterAtype(GlacierParser.AtypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link GlacierParser#atype}.
	 * @param ctx the parse tree
	 */
	void exitAtype(GlacierParser.AtypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link GlacierParser#inst_type}.
	 * @param ctx the parse tree
	 */
	void enterInst_type(GlacierParser.Inst_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link GlacierParser#inst_type}.
	 * @param ctx the parse tree
	 */
	void exitInst_type(GlacierParser.Inst_typeContext ctx);
	/**
	 * Enter a parse tree produced by {@link GlacierParser#deriv_types}.
	 * @param ctx the parse tree
	 */
	void enterDeriv_types(GlacierParser.Deriv_typesContext ctx);
	/**
	 * Exit a parse tree produced by {@link GlacierParser#deriv_types}.
	 * @param ctx the parse tree
	 */
	void exitDeriv_types(GlacierParser.Deriv_typesContext ctx);
	/**
	 * Enter a parse tree produced by {@link GlacierParser#comma_types}.
	 * @param ctx the parse tree
	 */
	void enterComma_types(GlacierParser.Comma_typesContext ctx);
	/**
	 * Exit a parse tree produced by {@link GlacierParser#comma_types}.
	 * @param ctx the parse tree
	 */
	void exitComma_types(GlacierParser.Comma_typesContext ctx);
	/**
	 * Enter a parse tree produced by {@link GlacierParser#bar_types2}.
	 * @param ctx the parse tree
	 */
	void enterBar_types2(GlacierParser.Bar_types2Context ctx);
	/**
	 * Exit a parse tree produced by {@link GlacierParser#bar_types2}.
	 * @param ctx the parse tree
	 */
	void exitBar_types2(GlacierParser.Bar_types2Context ctx);
	/**
	 * Enter a parse tree produced by {@link GlacierParser#tv_bndrs}.
	 * @param ctx the parse tree
	 */
	void enterTv_bndrs(GlacierParser.Tv_bndrsContext ctx);
	/**
	 * Exit a parse tree produced by {@link GlacierParser#tv_bndrs}.
	 * @param ctx the parse tree
	 */
	void exitTv_bndrs(GlacierParser.Tv_bndrsContext ctx);
	/**
	 * Enter a parse tree produced by {@link GlacierParser#tv_bndr}.
	 * @param ctx the parse tree
	 */
	void enterTv_bndr(GlacierParser.Tv_bndrContext ctx);
	/**
	 * Exit a parse tree produced by {@link GlacierParser#tv_bndr}.
	 * @param ctx the parse tree
	 */
	void exitTv_bndr(GlacierParser.Tv_bndrContext ctx);
	/**
	 * Enter a parse tree produced by {@link GlacierParser#tv_bndr_no_braces}.
	 * @param ctx the parse tree
	 */
	void enterTv_bndr_no_braces(GlacierParser.Tv_bndr_no_bracesContext ctx);
	/**
	 * Exit a parse tree produced by {@link GlacierParser#tv_bndr_no_braces}.
	 * @param ctx the parse tree
	 */
	void exitTv_bndr_no_braces(GlacierParser.Tv_bndr_no_bracesContext ctx);
	/**
	 * Enter a parse tree produced by {@link GlacierParser#fds}.
	 * @param ctx the parse tree
	 */
	void enterFds(GlacierParser.FdsContext ctx);
	/**
	 * Exit a parse tree produced by {@link GlacierParser#fds}.
	 * @param ctx the parse tree
	 */
	void exitFds(GlacierParser.FdsContext ctx);
	/**
	 * Enter a parse tree produced by {@link GlacierParser#fds1}.
	 * @param ctx the parse tree
	 */
	void enterFds1(GlacierParser.Fds1Context ctx);
	/**
	 * Exit a parse tree produced by {@link GlacierParser#fds1}.
	 * @param ctx the parse tree
	 */
	void exitFds1(GlacierParser.Fds1Context ctx);
	/**
	 * Enter a parse tree produced by {@link GlacierParser#fd}.
	 * @param ctx the parse tree
	 */
	void enterFd(GlacierParser.FdContext ctx);
	/**
	 * Exit a parse tree produced by {@link GlacierParser#fd}.
	 * @param ctx the parse tree
	 */
	void exitFd(GlacierParser.FdContext ctx);
	/**
	 * Enter a parse tree produced by {@link GlacierParser#varids0}.
	 * @param ctx the parse tree
	 */
	void enterVarids0(GlacierParser.Varids0Context ctx);
	/**
	 * Exit a parse tree produced by {@link GlacierParser#varids0}.
	 * @param ctx the parse tree
	 */
	void exitVarids0(GlacierParser.Varids0Context ctx);
	/**
	 * Enter a parse tree produced by {@link GlacierParser#kind}.
	 * @param ctx the parse tree
	 */
	void enterKind(GlacierParser.KindContext ctx);
	/**
	 * Exit a parse tree produced by {@link GlacierParser#kind}.
	 * @param ctx the parse tree
	 */
	void exitKind(GlacierParser.KindContext ctx);
	/**
	 * Enter a parse tree produced by {@link GlacierParser#gadt_constrlist}.
	 * @param ctx the parse tree
	 */
	void enterGadt_constrlist(GlacierParser.Gadt_constrlistContext ctx);
	/**
	 * Exit a parse tree produced by {@link GlacierParser#gadt_constrlist}.
	 * @param ctx the parse tree
	 */
	void exitGadt_constrlist(GlacierParser.Gadt_constrlistContext ctx);
	/**
	 * Enter a parse tree produced by {@link GlacierParser#gadt_constrs}.
	 * @param ctx the parse tree
	 */
	void enterGadt_constrs(GlacierParser.Gadt_constrsContext ctx);
	/**
	 * Exit a parse tree produced by {@link GlacierParser#gadt_constrs}.
	 * @param ctx the parse tree
	 */
	void exitGadt_constrs(GlacierParser.Gadt_constrsContext ctx);
	/**
	 * Enter a parse tree produced by {@link GlacierParser#gadt_constr_with_doc}.
	 * @param ctx the parse tree
	 */
	void enterGadt_constr_with_doc(GlacierParser.Gadt_constr_with_docContext ctx);
	/**
	 * Exit a parse tree produced by {@link GlacierParser#gadt_constr_with_doc}.
	 * @param ctx the parse tree
	 */
	void exitGadt_constr_with_doc(GlacierParser.Gadt_constr_with_docContext ctx);
	/**
	 * Enter a parse tree produced by {@link GlacierParser#gadt_constr}.
	 * @param ctx the parse tree
	 */
	void enterGadt_constr(GlacierParser.Gadt_constrContext ctx);
	/**
	 * Exit a parse tree produced by {@link GlacierParser#gadt_constr}.
	 * @param ctx the parse tree
	 */
	void exitGadt_constr(GlacierParser.Gadt_constrContext ctx);
	/**
	 * Enter a parse tree produced by {@link GlacierParser#constrs}.
	 * @param ctx the parse tree
	 */
	void enterConstrs(GlacierParser.ConstrsContext ctx);
	/**
	 * Exit a parse tree produced by {@link GlacierParser#constrs}.
	 * @param ctx the parse tree
	 */
	void exitConstrs(GlacierParser.ConstrsContext ctx);
	/**
	 * Enter a parse tree produced by {@link GlacierParser#constrs1}.
	 * @param ctx the parse tree
	 */
	void enterConstrs1(GlacierParser.Constrs1Context ctx);
	/**
	 * Exit a parse tree produced by {@link GlacierParser#constrs1}.
	 * @param ctx the parse tree
	 */
	void exitConstrs1(GlacierParser.Constrs1Context ctx);
	/**
	 * Enter a parse tree produced by {@link GlacierParser#constr}.
	 * @param ctx the parse tree
	 */
	void enterConstr(GlacierParser.ConstrContext ctx);
	/**
	 * Exit a parse tree produced by {@link GlacierParser#constr}.
	 * @param ctx the parse tree
	 */
	void exitConstr(GlacierParser.ConstrContext ctx);
	/**
	 * Enter a parse tree produced by {@link GlacierParser#forall}.
	 * @param ctx the parse tree
	 */
	void enterForall(GlacierParser.ForallContext ctx);
	/**
	 * Exit a parse tree produced by {@link GlacierParser#forall}.
	 * @param ctx the parse tree
	 */
	void exitForall(GlacierParser.ForallContext ctx);
	/**
	 * Enter a parse tree produced by {@link GlacierParser#constr_stuff}.
	 * @param ctx the parse tree
	 */
	void enterConstr_stuff(GlacierParser.Constr_stuffContext ctx);
	/**
	 * Exit a parse tree produced by {@link GlacierParser#constr_stuff}.
	 * @param ctx the parse tree
	 */
	void exitConstr_stuff(GlacierParser.Constr_stuffContext ctx);
	/**
	 * Enter a parse tree produced by {@link GlacierParser#fielddecls}.
	 * @param ctx the parse tree
	 */
	void enterFielddecls(GlacierParser.FielddeclsContext ctx);
	/**
	 * Exit a parse tree produced by {@link GlacierParser#fielddecls}.
	 * @param ctx the parse tree
	 */
	void exitFielddecls(GlacierParser.FielddeclsContext ctx);
	/**
	 * Enter a parse tree produced by {@link GlacierParser#fielddecl}.
	 * @param ctx the parse tree
	 */
	void enterFielddecl(GlacierParser.FielddeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link GlacierParser#fielddecl}.
	 * @param ctx the parse tree
	 */
	void exitFielddecl(GlacierParser.FielddeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link GlacierParser#derivings}.
	 * @param ctx the parse tree
	 */
	void enterDerivings(GlacierParser.DerivingsContext ctx);
	/**
	 * Exit a parse tree produced by {@link GlacierParser#derivings}.
	 * @param ctx the parse tree
	 */
	void exitDerivings(GlacierParser.DerivingsContext ctx);
	/**
	 * Enter a parse tree produced by {@link GlacierParser#deriving}.
	 * @param ctx the parse tree
	 */
	void enterDeriving(GlacierParser.DerivingContext ctx);
	/**
	 * Exit a parse tree produced by {@link GlacierParser#deriving}.
	 * @param ctx the parse tree
	 */
	void exitDeriving(GlacierParser.DerivingContext ctx);
	/**
	 * Enter a parse tree produced by {@link GlacierParser#deriv_clause_types}.
	 * @param ctx the parse tree
	 */
	void enterDeriv_clause_types(GlacierParser.Deriv_clause_typesContext ctx);
	/**
	 * Exit a parse tree produced by {@link GlacierParser#deriv_clause_types}.
	 * @param ctx the parse tree
	 */
	void exitDeriv_clause_types(GlacierParser.Deriv_clause_typesContext ctx);
	/**
	 * Enter a parse tree produced by {@link GlacierParser#decl_no_th}.
	 * @param ctx the parse tree
	 */
	void enterDecl_no_th(GlacierParser.Decl_no_thContext ctx);
	/**
	 * Exit a parse tree produced by {@link GlacierParser#decl_no_th}.
	 * @param ctx the parse tree
	 */
	void exitDecl_no_th(GlacierParser.Decl_no_thContext ctx);
	/**
	 * Enter a parse tree produced by {@link GlacierParser#decl}.
	 * @param ctx the parse tree
	 */
	void enterDecl(GlacierParser.DeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link GlacierParser#decl}.
	 * @param ctx the parse tree
	 */
	void exitDecl(GlacierParser.DeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link GlacierParser#rhs}.
	 * @param ctx the parse tree
	 */
	void enterRhs(GlacierParser.RhsContext ctx);
	/**
	 * Exit a parse tree produced by {@link GlacierParser#rhs}.
	 * @param ctx the parse tree
	 */
	void exitRhs(GlacierParser.RhsContext ctx);
	/**
	 * Enter a parse tree produced by {@link GlacierParser#gdrhs}.
	 * @param ctx the parse tree
	 */
	void enterGdrhs(GlacierParser.GdrhsContext ctx);
	/**
	 * Exit a parse tree produced by {@link GlacierParser#gdrhs}.
	 * @param ctx the parse tree
	 */
	void exitGdrhs(GlacierParser.GdrhsContext ctx);
	/**
	 * Enter a parse tree produced by {@link GlacierParser#gdrh}.
	 * @param ctx the parse tree
	 */
	void enterGdrh(GlacierParser.GdrhContext ctx);
	/**
	 * Exit a parse tree produced by {@link GlacierParser#gdrh}.
	 * @param ctx the parse tree
	 */
	void exitGdrh(GlacierParser.GdrhContext ctx);
	/**
	 * Enter a parse tree produced by {@link GlacierParser#sigdecl}.
	 * @param ctx the parse tree
	 */
	void enterSigdecl(GlacierParser.SigdeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link GlacierParser#sigdecl}.
	 * @param ctx the parse tree
	 */
	void exitSigdecl(GlacierParser.SigdeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link GlacierParser#activation}.
	 * @param ctx the parse tree
	 */
	void enterActivation(GlacierParser.ActivationContext ctx);
	/**
	 * Exit a parse tree produced by {@link GlacierParser#activation}.
	 * @param ctx the parse tree
	 */
	void exitActivation(GlacierParser.ActivationContext ctx);
	/**
	 * Enter a parse tree produced by {@link GlacierParser#th_quasiquote}.
	 * @param ctx the parse tree
	 */
	void enterTh_quasiquote(GlacierParser.Th_quasiquoteContext ctx);
	/**
	 * Exit a parse tree produced by {@link GlacierParser#th_quasiquote}.
	 * @param ctx the parse tree
	 */
	void exitTh_quasiquote(GlacierParser.Th_quasiquoteContext ctx);
	/**
	 * Enter a parse tree produced by {@link GlacierParser#th_qquasiquote}.
	 * @param ctx the parse tree
	 */
	void enterTh_qquasiquote(GlacierParser.Th_qquasiquoteContext ctx);
	/**
	 * Exit a parse tree produced by {@link GlacierParser#th_qquasiquote}.
	 * @param ctx the parse tree
	 */
	void exitTh_qquasiquote(GlacierParser.Th_qquasiquoteContext ctx);
	/**
	 * Enter a parse tree produced by {@link GlacierParser#quasiquote}.
	 * @param ctx the parse tree
	 */
	void enterQuasiquote(GlacierParser.QuasiquoteContext ctx);
	/**
	 * Exit a parse tree produced by {@link GlacierParser#quasiquote}.
	 * @param ctx the parse tree
	 */
	void exitQuasiquote(GlacierParser.QuasiquoteContext ctx);
	/**
	 * Enter a parse tree produced by {@link GlacierParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterExp(GlacierParser.ExpContext ctx);
	/**
	 * Exit a parse tree produced by {@link GlacierParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitExp(GlacierParser.ExpContext ctx);
	/**
	 * Enter a parse tree produced by {@link GlacierParser#infixexp}.
	 * @param ctx the parse tree
	 */
	void enterInfixexp(GlacierParser.InfixexpContext ctx);
	/**
	 * Exit a parse tree produced by {@link GlacierParser#infixexp}.
	 * @param ctx the parse tree
	 */
	void exitInfixexp(GlacierParser.InfixexpContext ctx);
	/**
	 * Enter a parse tree produced by {@link GlacierParser#exp10p}.
	 * @param ctx the parse tree
	 */
	void enterExp10p(GlacierParser.Exp10pContext ctx);
	/**
	 * Exit a parse tree produced by {@link GlacierParser#exp10p}.
	 * @param ctx the parse tree
	 */
	void exitExp10p(GlacierParser.Exp10pContext ctx);
	/**
	 * Enter a parse tree produced by {@link GlacierParser#exp10}.
	 * @param ctx the parse tree
	 */
	void enterExp10(GlacierParser.Exp10Context ctx);
	/**
	 * Exit a parse tree produced by {@link GlacierParser#exp10}.
	 * @param ctx the parse tree
	 */
	void exitExp10(GlacierParser.Exp10Context ctx);
	/**
	 * Enter a parse tree produced by {@link GlacierParser#fexp}.
	 * @param ctx the parse tree
	 */
	void enterFexp(GlacierParser.FexpContext ctx);
	/**
	 * Exit a parse tree produced by {@link GlacierParser#fexp}.
	 * @param ctx the parse tree
	 */
	void exitFexp(GlacierParser.FexpContext ctx);
	/**
	 * Enter a parse tree produced by {@link GlacierParser#aexp}.
	 * @param ctx the parse tree
	 */
	void enterAexp(GlacierParser.AexpContext ctx);
	/**
	 * Exit a parse tree produced by {@link GlacierParser#aexp}.
	 * @param ctx the parse tree
	 */
	void exitAexp(GlacierParser.AexpContext ctx);
	/**
	 * Enter a parse tree produced by {@link GlacierParser#aexp1}.
	 * @param ctx the parse tree
	 */
	void enterAexp1(GlacierParser.Aexp1Context ctx);
	/**
	 * Exit a parse tree produced by {@link GlacierParser#aexp1}.
	 * @param ctx the parse tree
	 */
	void exitAexp1(GlacierParser.Aexp1Context ctx);
	/**
	 * Enter a parse tree produced by {@link GlacierParser#aexp2}.
	 * @param ctx the parse tree
	 */
	void enterAexp2(GlacierParser.Aexp2Context ctx);
	/**
	 * Exit a parse tree produced by {@link GlacierParser#aexp2}.
	 * @param ctx the parse tree
	 */
	void exitAexp2(GlacierParser.Aexp2Context ctx);
	/**
	 * Enter a parse tree produced by {@link GlacierParser#splice_exp}.
	 * @param ctx the parse tree
	 */
	void enterSplice_exp(GlacierParser.Splice_expContext ctx);
	/**
	 * Exit a parse tree produced by {@link GlacierParser#splice_exp}.
	 * @param ctx the parse tree
	 */
	void exitSplice_exp(GlacierParser.Splice_expContext ctx);
	/**
	 * Enter a parse tree produced by {@link GlacierParser#splice_untyped}.
	 * @param ctx the parse tree
	 */
	void enterSplice_untyped(GlacierParser.Splice_untypedContext ctx);
	/**
	 * Exit a parse tree produced by {@link GlacierParser#splice_untyped}.
	 * @param ctx the parse tree
	 */
	void exitSplice_untyped(GlacierParser.Splice_untypedContext ctx);
	/**
	 * Enter a parse tree produced by {@link GlacierParser#splice_typed}.
	 * @param ctx the parse tree
	 */
	void enterSplice_typed(GlacierParser.Splice_typedContext ctx);
	/**
	 * Exit a parse tree produced by {@link GlacierParser#splice_typed}.
	 * @param ctx the parse tree
	 */
	void exitSplice_typed(GlacierParser.Splice_typedContext ctx);
	/**
	 * Enter a parse tree produced by {@link GlacierParser#cmdargs}.
	 * @param ctx the parse tree
	 */
	void enterCmdargs(GlacierParser.CmdargsContext ctx);
	/**
	 * Exit a parse tree produced by {@link GlacierParser#cmdargs}.
	 * @param ctx the parse tree
	 */
	void exitCmdargs(GlacierParser.CmdargsContext ctx);
	/**
	 * Enter a parse tree produced by {@link GlacierParser#acmd}.
	 * @param ctx the parse tree
	 */
	void enterAcmd(GlacierParser.AcmdContext ctx);
	/**
	 * Exit a parse tree produced by {@link GlacierParser#acmd}.
	 * @param ctx the parse tree
	 */
	void exitAcmd(GlacierParser.AcmdContext ctx);
	/**
	 * Enter a parse tree produced by {@link GlacierParser#cvtopbody}.
	 * @param ctx the parse tree
	 */
	void enterCvtopbody(GlacierParser.CvtopbodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link GlacierParser#cvtopbody}.
	 * @param ctx the parse tree
	 */
	void exitCvtopbody(GlacierParser.CvtopbodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link GlacierParser#cvtopdecls0}.
	 * @param ctx the parse tree
	 */
	void enterCvtopdecls0(GlacierParser.Cvtopdecls0Context ctx);
	/**
	 * Exit a parse tree produced by {@link GlacierParser#cvtopdecls0}.
	 * @param ctx the parse tree
	 */
	void exitCvtopdecls0(GlacierParser.Cvtopdecls0Context ctx);
	/**
	 * Enter a parse tree produced by {@link GlacierParser#texp}.
	 * @param ctx the parse tree
	 */
	void enterTexp(GlacierParser.TexpContext ctx);
	/**
	 * Exit a parse tree produced by {@link GlacierParser#texp}.
	 * @param ctx the parse tree
	 */
	void exitTexp(GlacierParser.TexpContext ctx);
	/**
	 * Enter a parse tree produced by {@link GlacierParser#tup_exprs}.
	 * @param ctx the parse tree
	 */
	void enterTup_exprs(GlacierParser.Tup_exprsContext ctx);
	/**
	 * Exit a parse tree produced by {@link GlacierParser#tup_exprs}.
	 * @param ctx the parse tree
	 */
	void exitTup_exprs(GlacierParser.Tup_exprsContext ctx);
	/**
	 * Enter a parse tree produced by {@link GlacierParser#commas_tup_tail}.
	 * @param ctx the parse tree
	 */
	void enterCommas_tup_tail(GlacierParser.Commas_tup_tailContext ctx);
	/**
	 * Exit a parse tree produced by {@link GlacierParser#commas_tup_tail}.
	 * @param ctx the parse tree
	 */
	void exitCommas_tup_tail(GlacierParser.Commas_tup_tailContext ctx);
	/**
	 * Enter a parse tree produced by {@link GlacierParser#tup_tail}.
	 * @param ctx the parse tree
	 */
	void enterTup_tail(GlacierParser.Tup_tailContext ctx);
	/**
	 * Exit a parse tree produced by {@link GlacierParser#tup_tail}.
	 * @param ctx the parse tree
	 */
	void exitTup_tail(GlacierParser.Tup_tailContext ctx);
	/**
	 * Enter a parse tree produced by {@link GlacierParser#list_hs}.
	 * @param ctx the parse tree
	 */
	void enterList_hs(GlacierParser.List_hsContext ctx);
	/**
	 * Exit a parse tree produced by {@link GlacierParser#list_hs}.
	 * @param ctx the parse tree
	 */
	void exitList_hs(GlacierParser.List_hsContext ctx);
	/**
	 * Enter a parse tree produced by {@link GlacierParser#lexps}.
	 * @param ctx the parse tree
	 */
	void enterLexps(GlacierParser.LexpsContext ctx);
	/**
	 * Exit a parse tree produced by {@link GlacierParser#lexps}.
	 * @param ctx the parse tree
	 */
	void exitLexps(GlacierParser.LexpsContext ctx);
	/**
	 * Enter a parse tree produced by {@link GlacierParser#flattenedpquals}.
	 * @param ctx the parse tree
	 */
	void enterFlattenedpquals(GlacierParser.FlattenedpqualsContext ctx);
	/**
	 * Exit a parse tree produced by {@link GlacierParser#flattenedpquals}.
	 * @param ctx the parse tree
	 */
	void exitFlattenedpquals(GlacierParser.FlattenedpqualsContext ctx);
	/**
	 * Enter a parse tree produced by {@link GlacierParser#pquals}.
	 * @param ctx the parse tree
	 */
	void enterPquals(GlacierParser.PqualsContext ctx);
	/**
	 * Exit a parse tree produced by {@link GlacierParser#pquals}.
	 * @param ctx the parse tree
	 */
	void exitPquals(GlacierParser.PqualsContext ctx);
	/**
	 * Enter a parse tree produced by {@link GlacierParser#squals}.
	 * @param ctx the parse tree
	 */
	void enterSquals(GlacierParser.SqualsContext ctx);
	/**
	 * Exit a parse tree produced by {@link GlacierParser#squals}.
	 * @param ctx the parse tree
	 */
	void exitSquals(GlacierParser.SqualsContext ctx);
	/**
	 * Enter a parse tree produced by {@link GlacierParser#transformqual}.
	 * @param ctx the parse tree
	 */
	void enterTransformqual(GlacierParser.TransformqualContext ctx);
	/**
	 * Exit a parse tree produced by {@link GlacierParser#transformqual}.
	 * @param ctx the parse tree
	 */
	void exitTransformqual(GlacierParser.TransformqualContext ctx);
	/**
	 * Enter a parse tree produced by {@link GlacierParser#guards}.
	 * @param ctx the parse tree
	 */
	void enterGuards(GlacierParser.GuardsContext ctx);
	/**
	 * Exit a parse tree produced by {@link GlacierParser#guards}.
	 * @param ctx the parse tree
	 */
	void exitGuards(GlacierParser.GuardsContext ctx);
	/**
	 * Enter a parse tree produced by {@link GlacierParser#guard}.
	 * @param ctx the parse tree
	 */
	void enterGuard(GlacierParser.GuardContext ctx);
	/**
	 * Exit a parse tree produced by {@link GlacierParser#guard}.
	 * @param ctx the parse tree
	 */
	void exitGuard(GlacierParser.GuardContext ctx);
	/**
	 * Enter a parse tree produced by {@link GlacierParser#alts}.
	 * @param ctx the parse tree
	 */
	void enterAlts(GlacierParser.AltsContext ctx);
	/**
	 * Exit a parse tree produced by {@link GlacierParser#alts}.
	 * @param ctx the parse tree
	 */
	void exitAlts(GlacierParser.AltsContext ctx);
	/**
	 * Enter a parse tree produced by {@link GlacierParser#alt}.
	 * @param ctx the parse tree
	 */
	void enterAlt(GlacierParser.AltContext ctx);
	/**
	 * Exit a parse tree produced by {@link GlacierParser#alt}.
	 * @param ctx the parse tree
	 */
	void exitAlt(GlacierParser.AltContext ctx);
	/**
	 * Enter a parse tree produced by {@link GlacierParser#alt_rhs}.
	 * @param ctx the parse tree
	 */
	void enterAlt_rhs(GlacierParser.Alt_rhsContext ctx);
	/**
	 * Exit a parse tree produced by {@link GlacierParser#alt_rhs}.
	 * @param ctx the parse tree
	 */
	void exitAlt_rhs(GlacierParser.Alt_rhsContext ctx);
	/**
	 * Enter a parse tree produced by {@link GlacierParser#ralt}.
	 * @param ctx the parse tree
	 */
	void enterRalt(GlacierParser.RaltContext ctx);
	/**
	 * Exit a parse tree produced by {@link GlacierParser#ralt}.
	 * @param ctx the parse tree
	 */
	void exitRalt(GlacierParser.RaltContext ctx);
	/**
	 * Enter a parse tree produced by {@link GlacierParser#gdpats}.
	 * @param ctx the parse tree
	 */
	void enterGdpats(GlacierParser.GdpatsContext ctx);
	/**
	 * Exit a parse tree produced by {@link GlacierParser#gdpats}.
	 * @param ctx the parse tree
	 */
	void exitGdpats(GlacierParser.GdpatsContext ctx);
	/**
	 * Enter a parse tree produced by {@link GlacierParser#ifgdpats}.
	 * @param ctx the parse tree
	 */
	void enterIfgdpats(GlacierParser.IfgdpatsContext ctx);
	/**
	 * Exit a parse tree produced by {@link GlacierParser#ifgdpats}.
	 * @param ctx the parse tree
	 */
	void exitIfgdpats(GlacierParser.IfgdpatsContext ctx);
	/**
	 * Enter a parse tree produced by {@link GlacierParser#gdpat}.
	 * @param ctx the parse tree
	 */
	void enterGdpat(GlacierParser.GdpatContext ctx);
	/**
	 * Exit a parse tree produced by {@link GlacierParser#gdpat}.
	 * @param ctx the parse tree
	 */
	void exitGdpat(GlacierParser.GdpatContext ctx);
	/**
	 * Enter a parse tree produced by {@link GlacierParser#pat}.
	 * @param ctx the parse tree
	 */
	void enterPat(GlacierParser.PatContext ctx);
	/**
	 * Exit a parse tree produced by {@link GlacierParser#pat}.
	 * @param ctx the parse tree
	 */
	void exitPat(GlacierParser.PatContext ctx);
	/**
	 * Enter a parse tree produced by {@link GlacierParser#bindpat}.
	 * @param ctx the parse tree
	 */
	void enterBindpat(GlacierParser.BindpatContext ctx);
	/**
	 * Exit a parse tree produced by {@link GlacierParser#bindpat}.
	 * @param ctx the parse tree
	 */
	void exitBindpat(GlacierParser.BindpatContext ctx);
	/**
	 * Enter a parse tree produced by {@link GlacierParser#apat}.
	 * @param ctx the parse tree
	 */
	void enterApat(GlacierParser.ApatContext ctx);
	/**
	 * Exit a parse tree produced by {@link GlacierParser#apat}.
	 * @param ctx the parse tree
	 */
	void exitApat(GlacierParser.ApatContext ctx);
	/**
	 * Enter a parse tree produced by {@link GlacierParser#apats}.
	 * @param ctx the parse tree
	 */
	void enterApats(GlacierParser.ApatsContext ctx);
	/**
	 * Exit a parse tree produced by {@link GlacierParser#apats}.
	 * @param ctx the parse tree
	 */
	void exitApats(GlacierParser.ApatsContext ctx);
	/**
	 * Enter a parse tree produced by {@link GlacierParser#fpat}.
	 * @param ctx the parse tree
	 */
	void enterFpat(GlacierParser.FpatContext ctx);
	/**
	 * Exit a parse tree produced by {@link GlacierParser#fpat}.
	 * @param ctx the parse tree
	 */
	void exitFpat(GlacierParser.FpatContext ctx);
	/**
	 * Enter a parse tree produced by {@link GlacierParser#stmtlist}.
	 * @param ctx the parse tree
	 */
	void enterStmtlist(GlacierParser.StmtlistContext ctx);
	/**
	 * Exit a parse tree produced by {@link GlacierParser#stmtlist}.
	 * @param ctx the parse tree
	 */
	void exitStmtlist(GlacierParser.StmtlistContext ctx);
	/**
	 * Enter a parse tree produced by {@link GlacierParser#stmts}.
	 * @param ctx the parse tree
	 */
	void enterStmts(GlacierParser.StmtsContext ctx);
	/**
	 * Exit a parse tree produced by {@link GlacierParser#stmts}.
	 * @param ctx the parse tree
	 */
	void exitStmts(GlacierParser.StmtsContext ctx);
	/**
	 * Enter a parse tree produced by {@link GlacierParser#stmt}.
	 * @param ctx the parse tree
	 */
	void enterStmt(GlacierParser.StmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link GlacierParser#stmt}.
	 * @param ctx the parse tree
	 */
	void exitStmt(GlacierParser.StmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link GlacierParser#qual}.
	 * @param ctx the parse tree
	 */
	void enterQual(GlacierParser.QualContext ctx);
	/**
	 * Exit a parse tree produced by {@link GlacierParser#qual}.
	 * @param ctx the parse tree
	 */
	void exitQual(GlacierParser.QualContext ctx);
	/**
	 * Enter a parse tree produced by {@link GlacierParser#fbinds}.
	 * @param ctx the parse tree
	 */
	void enterFbinds(GlacierParser.FbindsContext ctx);
	/**
	 * Exit a parse tree produced by {@link GlacierParser#fbinds}.
	 * @param ctx the parse tree
	 */
	void exitFbinds(GlacierParser.FbindsContext ctx);
	/**
	 * Enter a parse tree produced by {@link GlacierParser#fbind}.
	 * @param ctx the parse tree
	 */
	void enterFbind(GlacierParser.FbindContext ctx);
	/**
	 * Exit a parse tree produced by {@link GlacierParser#fbind}.
	 * @param ctx the parse tree
	 */
	void exitFbind(GlacierParser.FbindContext ctx);
	/**
	 * Enter a parse tree produced by {@link GlacierParser#dbinds}.
	 * @param ctx the parse tree
	 */
	void enterDbinds(GlacierParser.DbindsContext ctx);
	/**
	 * Exit a parse tree produced by {@link GlacierParser#dbinds}.
	 * @param ctx the parse tree
	 */
	void exitDbinds(GlacierParser.DbindsContext ctx);
	/**
	 * Enter a parse tree produced by {@link GlacierParser#dbind}.
	 * @param ctx the parse tree
	 */
	void enterDbind(GlacierParser.DbindContext ctx);
	/**
	 * Exit a parse tree produced by {@link GlacierParser#dbind}.
	 * @param ctx the parse tree
	 */
	void exitDbind(GlacierParser.DbindContext ctx);
	/**
	 * Enter a parse tree produced by {@link GlacierParser#name_boolformula_opt}.
	 * @param ctx the parse tree
	 */
	void enterName_boolformula_opt(GlacierParser.Name_boolformula_optContext ctx);
	/**
	 * Exit a parse tree produced by {@link GlacierParser#name_boolformula_opt}.
	 * @param ctx the parse tree
	 */
	void exitName_boolformula_opt(GlacierParser.Name_boolformula_optContext ctx);
	/**
	 * Enter a parse tree produced by {@link GlacierParser#name_boolformula_and}.
	 * @param ctx the parse tree
	 */
	void enterName_boolformula_and(GlacierParser.Name_boolformula_andContext ctx);
	/**
	 * Exit a parse tree produced by {@link GlacierParser#name_boolformula_and}.
	 * @param ctx the parse tree
	 */
	void exitName_boolformula_and(GlacierParser.Name_boolformula_andContext ctx);
	/**
	 * Enter a parse tree produced by {@link GlacierParser#name_boolformula_and_list}.
	 * @param ctx the parse tree
	 */
	void enterName_boolformula_and_list(GlacierParser.Name_boolformula_and_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link GlacierParser#name_boolformula_and_list}.
	 * @param ctx the parse tree
	 */
	void exitName_boolformula_and_list(GlacierParser.Name_boolformula_and_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link GlacierParser#name_boolformula_atom}.
	 * @param ctx the parse tree
	 */
	void enterName_boolformula_atom(GlacierParser.Name_boolformula_atomContext ctx);
	/**
	 * Exit a parse tree produced by {@link GlacierParser#name_boolformula_atom}.
	 * @param ctx the parse tree
	 */
	void exitName_boolformula_atom(GlacierParser.Name_boolformula_atomContext ctx);
	/**
	 * Enter a parse tree produced by {@link GlacierParser#namelist}.
	 * @param ctx the parse tree
	 */
	void enterNamelist(GlacierParser.NamelistContext ctx);
	/**
	 * Exit a parse tree produced by {@link GlacierParser#namelist}.
	 * @param ctx the parse tree
	 */
	void exitNamelist(GlacierParser.NamelistContext ctx);
	/**
	 * Enter a parse tree produced by {@link GlacierParser#name_var}.
	 * @param ctx the parse tree
	 */
	void enterName_var(GlacierParser.Name_varContext ctx);
	/**
	 * Exit a parse tree produced by {@link GlacierParser#name_var}.
	 * @param ctx the parse tree
	 */
	void exitName_var(GlacierParser.Name_varContext ctx);
	/**
	 * Enter a parse tree produced by {@link GlacierParser#qcon_nowiredlist}.
	 * @param ctx the parse tree
	 */
	void enterQcon_nowiredlist(GlacierParser.Qcon_nowiredlistContext ctx);
	/**
	 * Exit a parse tree produced by {@link GlacierParser#qcon_nowiredlist}.
	 * @param ctx the parse tree
	 */
	void exitQcon_nowiredlist(GlacierParser.Qcon_nowiredlistContext ctx);
	/**
	 * Enter a parse tree produced by {@link GlacierParser#qcon}.
	 * @param ctx the parse tree
	 */
	void enterQcon(GlacierParser.QconContext ctx);
	/**
	 * Exit a parse tree produced by {@link GlacierParser#qcon}.
	 * @param ctx the parse tree
	 */
	void exitQcon(GlacierParser.QconContext ctx);
	/**
	 * Enter a parse tree produced by {@link GlacierParser#gen_qcon}.
	 * @param ctx the parse tree
	 */
	void enterGen_qcon(GlacierParser.Gen_qconContext ctx);
	/**
	 * Exit a parse tree produced by {@link GlacierParser#gen_qcon}.
	 * @param ctx the parse tree
	 */
	void exitGen_qcon(GlacierParser.Gen_qconContext ctx);
	/**
	 * Enter a parse tree produced by {@link GlacierParser#con}.
	 * @param ctx the parse tree
	 */
	void enterCon(GlacierParser.ConContext ctx);
	/**
	 * Exit a parse tree produced by {@link GlacierParser#con}.
	 * @param ctx the parse tree
	 */
	void exitCon(GlacierParser.ConContext ctx);
	/**
	 * Enter a parse tree produced by {@link GlacierParser#con_list}.
	 * @param ctx the parse tree
	 */
	void enterCon_list(GlacierParser.Con_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link GlacierParser#con_list}.
	 * @param ctx the parse tree
	 */
	void exitCon_list(GlacierParser.Con_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link GlacierParser#sysdcon_nolist}.
	 * @param ctx the parse tree
	 */
	void enterSysdcon_nolist(GlacierParser.Sysdcon_nolistContext ctx);
	/**
	 * Exit a parse tree produced by {@link GlacierParser#sysdcon_nolist}.
	 * @param ctx the parse tree
	 */
	void exitSysdcon_nolist(GlacierParser.Sysdcon_nolistContext ctx);
	/**
	 * Enter a parse tree produced by {@link GlacierParser#sysdcon}.
	 * @param ctx the parse tree
	 */
	void enterSysdcon(GlacierParser.SysdconContext ctx);
	/**
	 * Exit a parse tree produced by {@link GlacierParser#sysdcon}.
	 * @param ctx the parse tree
	 */
	void exitSysdcon(GlacierParser.SysdconContext ctx);
	/**
	 * Enter a parse tree produced by {@link GlacierParser#conop}.
	 * @param ctx the parse tree
	 */
	void enterConop(GlacierParser.ConopContext ctx);
	/**
	 * Exit a parse tree produced by {@link GlacierParser#conop}.
	 * @param ctx the parse tree
	 */
	void exitConop(GlacierParser.ConopContext ctx);
	/**
	 * Enter a parse tree produced by {@link GlacierParser#qconop}.
	 * @param ctx the parse tree
	 */
	void enterQconop(GlacierParser.QconopContext ctx);
	/**
	 * Exit a parse tree produced by {@link GlacierParser#qconop}.
	 * @param ctx the parse tree
	 */
	void exitQconop(GlacierParser.QconopContext ctx);
	/**
	 * Enter a parse tree produced by {@link GlacierParser#gconsym}.
	 * @param ctx the parse tree
	 */
	void enterGconsym(GlacierParser.GconsymContext ctx);
	/**
	 * Exit a parse tree produced by {@link GlacierParser#gconsym}.
	 * @param ctx the parse tree
	 */
	void exitGconsym(GlacierParser.GconsymContext ctx);
	/**
	 * Enter a parse tree produced by {@link GlacierParser#gtycon}.
	 * @param ctx the parse tree
	 */
	void enterGtycon(GlacierParser.GtyconContext ctx);
	/**
	 * Exit a parse tree produced by {@link GlacierParser#gtycon}.
	 * @param ctx the parse tree
	 */
	void exitGtycon(GlacierParser.GtyconContext ctx);
	/**
	 * Enter a parse tree produced by {@link GlacierParser#ntgtycon}.
	 * @param ctx the parse tree
	 */
	void enterNtgtycon(GlacierParser.NtgtyconContext ctx);
	/**
	 * Exit a parse tree produced by {@link GlacierParser#ntgtycon}.
	 * @param ctx the parse tree
	 */
	void exitNtgtycon(GlacierParser.NtgtyconContext ctx);
	/**
	 * Enter a parse tree produced by {@link GlacierParser#oqtycon}.
	 * @param ctx the parse tree
	 */
	void enterOqtycon(GlacierParser.OqtyconContext ctx);
	/**
	 * Exit a parse tree produced by {@link GlacierParser#oqtycon}.
	 * @param ctx the parse tree
	 */
	void exitOqtycon(GlacierParser.OqtyconContext ctx);
	/**
	 * Enter a parse tree produced by {@link GlacierParser#qtyconop}.
	 * @param ctx the parse tree
	 */
	void enterQtyconop(GlacierParser.QtyconopContext ctx);
	/**
	 * Exit a parse tree produced by {@link GlacierParser#qtyconop}.
	 * @param ctx the parse tree
	 */
	void exitQtyconop(GlacierParser.QtyconopContext ctx);
	/**
	 * Enter a parse tree produced by {@link GlacierParser#qtycon}.
	 * @param ctx the parse tree
	 */
	void enterQtycon(GlacierParser.QtyconContext ctx);
	/**
	 * Exit a parse tree produced by {@link GlacierParser#qtycon}.
	 * @param ctx the parse tree
	 */
	void exitQtycon(GlacierParser.QtyconContext ctx);
	/**
	 * Enter a parse tree produced by {@link GlacierParser#tycon}.
	 * @param ctx the parse tree
	 */
	void enterTycon(GlacierParser.TyconContext ctx);
	/**
	 * Exit a parse tree produced by {@link GlacierParser#tycon}.
	 * @param ctx the parse tree
	 */
	void exitTycon(GlacierParser.TyconContext ctx);
	/**
	 * Enter a parse tree produced by {@link GlacierParser#qtyconsym}.
	 * @param ctx the parse tree
	 */
	void enterQtyconsym(GlacierParser.QtyconsymContext ctx);
	/**
	 * Exit a parse tree produced by {@link GlacierParser#qtyconsym}.
	 * @param ctx the parse tree
	 */
	void exitQtyconsym(GlacierParser.QtyconsymContext ctx);
	/**
	 * Enter a parse tree produced by {@link GlacierParser#tyconsym}.
	 * @param ctx the parse tree
	 */
	void enterTyconsym(GlacierParser.TyconsymContext ctx);
	/**
	 * Exit a parse tree produced by {@link GlacierParser#tyconsym}.
	 * @param ctx the parse tree
	 */
	void exitTyconsym(GlacierParser.TyconsymContext ctx);
	/**
	 * Enter a parse tree produced by {@link GlacierParser#op}.
	 * @param ctx the parse tree
	 */
	void enterOp(GlacierParser.OpContext ctx);
	/**
	 * Exit a parse tree produced by {@link GlacierParser#op}.
	 * @param ctx the parse tree
	 */
	void exitOp(GlacierParser.OpContext ctx);
	/**
	 * Enter a parse tree produced by {@link GlacierParser#varop}.
	 * @param ctx the parse tree
	 */
	void enterVarop(GlacierParser.VaropContext ctx);
	/**
	 * Exit a parse tree produced by {@link GlacierParser#varop}.
	 * @param ctx the parse tree
	 */
	void exitVarop(GlacierParser.VaropContext ctx);
	/**
	 * Enter a parse tree produced by {@link GlacierParser#qop}.
	 * @param ctx the parse tree
	 */
	void enterQop(GlacierParser.QopContext ctx);
	/**
	 * Exit a parse tree produced by {@link GlacierParser#qop}.
	 * @param ctx the parse tree
	 */
	void exitQop(GlacierParser.QopContext ctx);
	/**
	 * Enter a parse tree produced by {@link GlacierParser#qopm}.
	 * @param ctx the parse tree
	 */
	void enterQopm(GlacierParser.QopmContext ctx);
	/**
	 * Exit a parse tree produced by {@link GlacierParser#qopm}.
	 * @param ctx the parse tree
	 */
	void exitQopm(GlacierParser.QopmContext ctx);
	/**
	 * Enter a parse tree produced by {@link GlacierParser#hole_op}.
	 * @param ctx the parse tree
	 */
	void enterHole_op(GlacierParser.Hole_opContext ctx);
	/**
	 * Exit a parse tree produced by {@link GlacierParser#hole_op}.
	 * @param ctx the parse tree
	 */
	void exitHole_op(GlacierParser.Hole_opContext ctx);
	/**
	 * Enter a parse tree produced by {@link GlacierParser#qvarop}.
	 * @param ctx the parse tree
	 */
	void enterQvarop(GlacierParser.QvaropContext ctx);
	/**
	 * Exit a parse tree produced by {@link GlacierParser#qvarop}.
	 * @param ctx the parse tree
	 */
	void exitQvarop(GlacierParser.QvaropContext ctx);
	/**
	 * Enter a parse tree produced by {@link GlacierParser#qvaropm}.
	 * @param ctx the parse tree
	 */
	void enterQvaropm(GlacierParser.QvaropmContext ctx);
	/**
	 * Exit a parse tree produced by {@link GlacierParser#qvaropm}.
	 * @param ctx the parse tree
	 */
	void exitQvaropm(GlacierParser.QvaropmContext ctx);
	/**
	 * Enter a parse tree produced by {@link GlacierParser#tyvar}.
	 * @param ctx the parse tree
	 */
	void enterTyvar(GlacierParser.TyvarContext ctx);
	/**
	 * Exit a parse tree produced by {@link GlacierParser#tyvar}.
	 * @param ctx the parse tree
	 */
	void exitTyvar(GlacierParser.TyvarContext ctx);
	/**
	 * Enter a parse tree produced by {@link GlacierParser#tyvarop}.
	 * @param ctx the parse tree
	 */
	void enterTyvarop(GlacierParser.TyvaropContext ctx);
	/**
	 * Exit a parse tree produced by {@link GlacierParser#tyvarop}.
	 * @param ctx the parse tree
	 */
	void exitTyvarop(GlacierParser.TyvaropContext ctx);
	/**
	 * Enter a parse tree produced by {@link GlacierParser#tyvarid}.
	 * @param ctx the parse tree
	 */
	void enterTyvarid(GlacierParser.TyvaridContext ctx);
	/**
	 * Exit a parse tree produced by {@link GlacierParser#tyvarid}.
	 * @param ctx the parse tree
	 */
	void exitTyvarid(GlacierParser.TyvaridContext ctx);
	/**
	 * Enter a parse tree produced by {@link GlacierParser#tycls}.
	 * @param ctx the parse tree
	 */
	void enterTycls(GlacierParser.TyclsContext ctx);
	/**
	 * Exit a parse tree produced by {@link GlacierParser#tycls}.
	 * @param ctx the parse tree
	 */
	void exitTycls(GlacierParser.TyclsContext ctx);
	/**
	 * Enter a parse tree produced by {@link GlacierParser#qtycls}.
	 * @param ctx the parse tree
	 */
	void enterQtycls(GlacierParser.QtyclsContext ctx);
	/**
	 * Exit a parse tree produced by {@link GlacierParser#qtycls}.
	 * @param ctx the parse tree
	 */
	void exitQtycls(GlacierParser.QtyclsContext ctx);
	/**
	 * Enter a parse tree produced by {@link GlacierParser#var}.
	 * @param ctx the parse tree
	 */
	void enterVar(GlacierParser.VarContext ctx);
	/**
	 * Exit a parse tree produced by {@link GlacierParser#var}.
	 * @param ctx the parse tree
	 */
	void exitVar(GlacierParser.VarContext ctx);
	/**
	 * Enter a parse tree produced by {@link GlacierParser#qvar}.
	 * @param ctx the parse tree
	 */
	void enterQvar(GlacierParser.QvarContext ctx);
	/**
	 * Exit a parse tree produced by {@link GlacierParser#qvar}.
	 * @param ctx the parse tree
	 */
	void exitQvar(GlacierParser.QvarContext ctx);
	/**
	 * Enter a parse tree produced by {@link GlacierParser#qvarid}.
	 * @param ctx the parse tree
	 */
	void enterQvarid(GlacierParser.QvaridContext ctx);
	/**
	 * Exit a parse tree produced by {@link GlacierParser#qvarid}.
	 * @param ctx the parse tree
	 */
	void exitQvarid(GlacierParser.QvaridContext ctx);
	/**
	 * Enter a parse tree produced by {@link GlacierParser#varid}.
	 * @param ctx the parse tree
	 */
	void enterVarid(GlacierParser.VaridContext ctx);
	/**
	 * Exit a parse tree produced by {@link GlacierParser#varid}.
	 * @param ctx the parse tree
	 */
	void exitVarid(GlacierParser.VaridContext ctx);
	/**
	 * Enter a parse tree produced by {@link GlacierParser#qvarsym}.
	 * @param ctx the parse tree
	 */
	void enterQvarsym(GlacierParser.QvarsymContext ctx);
	/**
	 * Exit a parse tree produced by {@link GlacierParser#qvarsym}.
	 * @param ctx the parse tree
	 */
	void exitQvarsym(GlacierParser.QvarsymContext ctx);
	/**
	 * Enter a parse tree produced by {@link GlacierParser#qvarsym_no_minus}.
	 * @param ctx the parse tree
	 */
	void enterQvarsym_no_minus(GlacierParser.Qvarsym_no_minusContext ctx);
	/**
	 * Exit a parse tree produced by {@link GlacierParser#qvarsym_no_minus}.
	 * @param ctx the parse tree
	 */
	void exitQvarsym_no_minus(GlacierParser.Qvarsym_no_minusContext ctx);
	/**
	 * Enter a parse tree produced by {@link GlacierParser#varsym}.
	 * @param ctx the parse tree
	 */
	void enterVarsym(GlacierParser.VarsymContext ctx);
	/**
	 * Exit a parse tree produced by {@link GlacierParser#varsym}.
	 * @param ctx the parse tree
	 */
	void exitVarsym(GlacierParser.VarsymContext ctx);
	/**
	 * Enter a parse tree produced by {@link GlacierParser#varsym_no_minus}.
	 * @param ctx the parse tree
	 */
	void enterVarsym_no_minus(GlacierParser.Varsym_no_minusContext ctx);
	/**
	 * Exit a parse tree produced by {@link GlacierParser#varsym_no_minus}.
	 * @param ctx the parse tree
	 */
	void exitVarsym_no_minus(GlacierParser.Varsym_no_minusContext ctx);
	/**
	 * Enter a parse tree produced by {@link GlacierParser#special_id}.
	 * @param ctx the parse tree
	 */
	void enterSpecial_id(GlacierParser.Special_idContext ctx);
	/**
	 * Exit a parse tree produced by {@link GlacierParser#special_id}.
	 * @param ctx the parse tree
	 */
	void exitSpecial_id(GlacierParser.Special_idContext ctx);
	/**
	 * Enter a parse tree produced by {@link GlacierParser#qconid}.
	 * @param ctx the parse tree
	 */
	void enterQconid(GlacierParser.QconidContext ctx);
	/**
	 * Exit a parse tree produced by {@link GlacierParser#qconid}.
	 * @param ctx the parse tree
	 */
	void exitQconid(GlacierParser.QconidContext ctx);
	/**
	 * Enter a parse tree produced by {@link GlacierParser#conid}.
	 * @param ctx the parse tree
	 */
	void enterConid(GlacierParser.ConidContext ctx);
	/**
	 * Exit a parse tree produced by {@link GlacierParser#conid}.
	 * @param ctx the parse tree
	 */
	void exitConid(GlacierParser.ConidContext ctx);
	/**
	 * Enter a parse tree produced by {@link GlacierParser#qconsym}.
	 * @param ctx the parse tree
	 */
	void enterQconsym(GlacierParser.QconsymContext ctx);
	/**
	 * Exit a parse tree produced by {@link GlacierParser#qconsym}.
	 * @param ctx the parse tree
	 */
	void exitQconsym(GlacierParser.QconsymContext ctx);
	/**
	 * Enter a parse tree produced by {@link GlacierParser#consym}.
	 * @param ctx the parse tree
	 */
	void enterConsym(GlacierParser.ConsymContext ctx);
	/**
	 * Exit a parse tree produced by {@link GlacierParser#consym}.
	 * @param ctx the parse tree
	 */
	void exitConsym(GlacierParser.ConsymContext ctx);
	/**
	 * Enter a parse tree produced by {@link GlacierParser#literal}.
	 * @param ctx the parse tree
	 */
	void enterLiteral(GlacierParser.LiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link GlacierParser#literal}.
	 * @param ctx the parse tree
	 */
	void exitLiteral(GlacierParser.LiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link GlacierParser#open_hs}.
	 * @param ctx the parse tree
	 */
	void enterOpen_hs(GlacierParser.Open_hsContext ctx);
	/**
	 * Exit a parse tree produced by {@link GlacierParser#open_hs}.
	 * @param ctx the parse tree
	 */
	void exitOpen_hs(GlacierParser.Open_hsContext ctx);
	/**
	 * Enter a parse tree produced by {@link GlacierParser#close}.
	 * @param ctx the parse tree
	 */
	void enterClose(GlacierParser.CloseContext ctx);
	/**
	 * Exit a parse tree produced by {@link GlacierParser#close}.
	 * @param ctx the parse tree
	 */
	void exitClose(GlacierParser.CloseContext ctx);
	/**
	 * Enter a parse tree produced by {@link GlacierParser#semi}.
	 * @param ctx the parse tree
	 */
	void enterSemi(GlacierParser.SemiContext ctx);
	/**
	 * Exit a parse tree produced by {@link GlacierParser#semi}.
	 * @param ctx the parse tree
	 */
	void exitSemi(GlacierParser.SemiContext ctx);
	/**
	 * Enter a parse tree produced by {@link GlacierParser#modid}.
	 * @param ctx the parse tree
	 */
	void enterModid(GlacierParser.ModidContext ctx);
	/**
	 * Exit a parse tree produced by {@link GlacierParser#modid}.
	 * @param ctx the parse tree
	 */
	void exitModid(GlacierParser.ModidContext ctx);
	/**
	 * Enter a parse tree produced by {@link GlacierParser#commas}.
	 * @param ctx the parse tree
	 */
	void enterCommas(GlacierParser.CommasContext ctx);
	/**
	 * Exit a parse tree produced by {@link GlacierParser#commas}.
	 * @param ctx the parse tree
	 */
	void exitCommas(GlacierParser.CommasContext ctx);
	/**
	 * Enter a parse tree produced by {@link GlacierParser#bars}.
	 * @param ctx the parse tree
	 */
	void enterBars(GlacierParser.BarsContext ctx);
	/**
	 * Exit a parse tree produced by {@link GlacierParser#bars}.
	 * @param ctx the parse tree
	 */
	void exitBars(GlacierParser.BarsContext ctx);
	/**
	 * Enter a parse tree produced by {@link GlacierParser#special}.
	 * @param ctx the parse tree
	 */
	void enterSpecial(GlacierParser.SpecialContext ctx);
	/**
	 * Exit a parse tree produced by {@link GlacierParser#special}.
	 * @param ctx the parse tree
	 */
	void exitSpecial(GlacierParser.SpecialContext ctx);
	/**
	 * Enter a parse tree produced by {@link GlacierParser#symbol}.
	 * @param ctx the parse tree
	 */
	void enterSymbol(GlacierParser.SymbolContext ctx);
	/**
	 * Exit a parse tree produced by {@link GlacierParser#symbol}.
	 * @param ctx the parse tree
	 */
	void exitSymbol(GlacierParser.SymbolContext ctx);
	/**
	 * Enter a parse tree produced by {@link GlacierParser#ascSymbol}.
	 * @param ctx the parse tree
	 */
	void enterAscSymbol(GlacierParser.AscSymbolContext ctx);
	/**
	 * Exit a parse tree produced by {@link GlacierParser#ascSymbol}.
	 * @param ctx the parse tree
	 */
	void exitAscSymbol(GlacierParser.AscSymbolContext ctx);
	/**
	 * Enter a parse tree produced by {@link GlacierParser#integer}.
	 * @param ctx the parse tree
	 */
	void enterInteger(GlacierParser.IntegerContext ctx);
	/**
	 * Exit a parse tree produced by {@link GlacierParser#integer}.
	 * @param ctx the parse tree
	 */
	void exitInteger(GlacierParser.IntegerContext ctx);
	/**
	 * Enter a parse tree produced by {@link GlacierParser#pfloat}.
	 * @param ctx the parse tree
	 */
	void enterPfloat(GlacierParser.PfloatContext ctx);
	/**
	 * Exit a parse tree produced by {@link GlacierParser#pfloat}.
	 * @param ctx the parse tree
	 */
	void exitPfloat(GlacierParser.PfloatContext ctx);
	/**
	 * Enter a parse tree produced by {@link GlacierParser#pchar}.
	 * @param ctx the parse tree
	 */
	void enterPchar(GlacierParser.PcharContext ctx);
	/**
	 * Exit a parse tree produced by {@link GlacierParser#pchar}.
	 * @param ctx the parse tree
	 */
	void exitPchar(GlacierParser.PcharContext ctx);
	/**
	 * Enter a parse tree produced by {@link GlacierParser#pstring}.
	 * @param ctx the parse tree
	 */
	void enterPstring(GlacierParser.PstringContext ctx);
	/**
	 * Exit a parse tree produced by {@link GlacierParser#pstring}.
	 * @param ctx the parse tree
	 */
	void exitPstring(GlacierParser.PstringContext ctx);
}