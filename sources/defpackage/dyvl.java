package defpackage;

import java.util.ArrayList;
import java.util.HashMap;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dyvl {
    public static emxc a(HashMap hashMap) {
        try {
            dzit dzitVar = new dzit();
            dzitVar.e((String) hashMap.get("RAW_TEXT"));
            if (hashMap.containsKey("SKIP_LEADING_NEWLINE")) {
                dzitVar.f(((Boolean) hashMap.get("SKIP_LEADING_NEWLINE")).booleanValue());
            }
            if (hashMap.containsKey("PREDEFINED_STYLE")) {
                dzitVar.d(dzrq.a(((Integer) hashMap.get("PREDEFINED_STYLE")).intValue()));
            }
            if (hashMap.containsKey("LINE_STYLES")) {
                engw b = dyhx.b((ArrayList) hashMap.get("LINE_STYLES"), new emwl() { // from class: dyvc
                    @Override // defpackage.emwl
                    public final Object apply(Object obj) {
                        int ordinal;
                        HashMap hashMap2 = (HashMap) obj;
                        try {
                            ordinal = dzro.a(((Integer) hashMap2.get("LINE_STYLE_TYPE")).intValue()).ordinal();
                        } catch (Exception unused) {
                            dyhr.c("RichTextConverters", "failed to convert HashMap to LineStyle");
                        }
                        return ordinal != 0 ? ordinal != 1 ? ordinal != 2 ? emux.a : emxc.j(dzle.a) : emxc.j(new dzlf(((Integer) hashMap2.get("INDENTATION")).intValue())) : emxc.j(dzlg.a);
                    }
                });
                if (!b.isEmpty()) {
                    dzitVar.c(b);
                }
            }
            if (hashMap.containsKey("FORMATTED_TEXT_SPANS")) {
                engw b2 = dyhx.b((ArrayList) hashMap.get("FORMATTED_TEXT_SPANS"), new emwl() { // from class: dyvd
                    @Override // defpackage.emwl
                    public final Object apply(Object obj) {
                        return dyvl.b((HashMap) obj);
                    }
                });
                if (!b2.isEmpty()) {
                    dzitVar.b(b2);
                }
            }
            return emxc.j(dzitVar.a());
        } catch (TypeNotPresentException e) {
            throw e;
        } catch (Exception e2) {
            dyhr.d("RichTextConverters", "failed to convert HashMap to FormattedLine", e2);
            return emux.a;
        }
    }

    public static emxc b(HashMap hashMap) {
        try {
            dziv dzivVar = new dziv();
            dzivVar.c(((Integer) hashMap.get("START_INDEX")).intValue());
            dzivVar.b(((Integer) hashMap.get("END_INDEX")).intValue());
            engw b = dyhx.b((ArrayList) hashMap.get("TEXT_STYLES"), new emwl() { // from class: dyvj
                @Override // defpackage.emwl
                public final Object apply(Object obj) {
                    HashMap hashMap2 = (HashMap) obj;
                    try {
                        switch (dzrt.a(((Integer) hashMap2.get("TEXT_STYLE_TYPE")).intValue())) {
                            case UNKNOWN:
                                return emxc.j(new dzlu());
                            case BOLD:
                                return emxc.j(new dzlj());
                            case ITALIC:
                                return emxc.j(new dzln());
                            case UNDERLINE:
                                return emxc.j(new dzlt());
                            case STRIKETHROUGH:
                                return emxc.j(new dzlp());
                            case SUPERSCRIPT:
                                return emxc.j(new dzlr());
                            case SUBSCRIPT:
                                return emxc.j(new dzlq());
                            case COLOR:
                                return emxc.j(new dzlk(((Integer) hashMap2.get("COLOR")).intValue()));
                            case BACKGROUND_COLOR:
                                return emxc.j(new dzli(((Integer) hashMap2.get("BACKGROUND_COLOR")).intValue()));
                            case SIZE:
                                return emxc.j(new dzlo(((Integer) hashMap2.get("SIZE")).intValue()));
                            case TYPEFACE_LIST:
                                return emxc.j(dzlw.a(dyhx.c((ArrayList) hashMap2.get("TYPEFACE_LIST"), new emwl() { // from class: dyvh
                                    @Override // defpackage.emwl
                                    public final Object apply(Object obj2) {
                                        return dzrv.a(((Integer) obj2).intValue());
                                    }
                                })));
                            case HORIZONTAL_ALIGNMENT:
                                return emxc.j(new dzll(((Integer) hashMap2.get("HORIZONTAL_ALIGNMENT")).intValue()));
                            case HYPER_LINK:
                                dzoe dzoeVar = new dzoe();
                                dzoeVar.b((String) hashMap2.get("HYPER_LINK_V2"));
                                return emxc.j(new dzlm(dzoeVar.a()));
                        }
                    } catch (Exception e) {
                        dyhr.c("RichTextConverters", "Failed to convert HashMap to TextStyle");
                        if (hashMap2.containsKey("HYPER_LINK")) {
                            throw new TypeNotPresentException("HYPER_LINK no longer supports reading from deprecated HYPER_LINK key", e);
                        }
                    }
                    return emux.a;
                }
            });
            if (b.isEmpty()) {
                return emux.a;
            }
            dzivVar.d(b);
            return emxc.j(dzivVar.a());
        } catch (TypeNotPresentException e) {
            throw e;
        } catch (Exception unused) {
            dyhr.c("RichTextConverters", "failed to convert HashMap to FormattedTextSpan");
            return emux.a;
        }
    }

    public static emxc c(HashMap hashMap) {
        try {
            engw b = dyhx.b((ArrayList) hashMap.get("FORMATTED_LINES"), new emwl() { // from class: dyvb
                @Override // defpackage.emwl
                public final Object apply(Object obj) {
                    return dyvl.a((HashMap) obj);
                }
            });
            if (b.isEmpty()) {
                return emux.a;
            }
            dzir dzirVar = new dzir();
            dzirVar.b(b);
            return emxc.j(dzirVar.a());
        } catch (Exception unused) {
            dyhr.c("RichTextConverters", "failed to convert HashMap to RichText");
            return emux.a;
        }
    }

    public static HashMap d(dzrw dzrwVar) {
        HashMap hashMap = new HashMap();
        hashMap.put("FORMATTED_LINES", dyhx.d(dzrwVar.a(), new emwl() { // from class: dyvi
            /* JADX WARN: Type inference failed for: r1v11, types: [java.lang.Object, java.util.Collection] */
            /* JADX WARN: Type inference failed for: r1v14, types: [java.lang.Object, java.util.Collection] */
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                dzrh dzrhVar = (dzrh) obj;
                HashMap hashMap2 = new HashMap();
                hashMap2.put("RAW_TEXT", dzrhVar.e());
                if (dzrhVar.c().g()) {
                    hashMap2.put("PREDEFINED_STYLE", Integer.valueOf(((dzrq) dzrhVar.c().c()).g));
                }
                if (dzrhVar.b().g()) {
                    hashMap2.put("LINE_STYLES", dyhx.d(dzrhVar.b().c(), new emwl() { // from class: dyve
                        @Override // defpackage.emwl
                        public final Object apply(Object obj2) {
                            dzrm dzrmVar = (dzrm) obj2;
                            HashMap hashMap3 = new HashMap();
                            hashMap3.put("LINE_STYLE_TYPE", Integer.valueOf(dzrmVar.a().d));
                            if (dzrmVar.a() == dzro.INDENTATION) {
                                hashMap3.put("INDENTATION", Integer.valueOf(dzrmVar.b()));
                            }
                            return hashMap3;
                        }
                    }));
                }
                if (dzrhVar.a().g()) {
                    hashMap2.put("FORMATTED_TEXT_SPANS", dyhx.d(dzrhVar.a().c(), new emwl() { // from class: dyvf
                        @Override // defpackage.emwl
                        public final Object apply(Object obj2) {
                            dzrj dzrjVar = (dzrj) obj2;
                            HashMap hashMap3 = new HashMap();
                            hashMap3.put("START_INDEX", Integer.valueOf(dzrjVar.b()));
                            hashMap3.put("END_INDEX", Integer.valueOf(dzrjVar.a()));
                            hashMap3.put("TEXT_STYLES", dyhx.d(dzrjVar.c(), new emwl() { // from class: dyvk
                                @Override // defpackage.emwl
                                public final Object apply(Object obj3) {
                                    dzrr dzrrVar = (dzrr) obj3;
                                    HashMap hashMap4 = new HashMap();
                                    hashMap4.put("TEXT_STYLE_TYPE", Integer.valueOf(dzrrVar.b().n));
                                    if (dzrrVar.b() == dzrt.COLOR) {
                                        hashMap4.put("COLOR", Integer.valueOf(dzrrVar.d()));
                                    }
                                    if (dzrrVar.b() == dzrt.BACKGROUND_COLOR) {
                                        hashMap4.put("BACKGROUND_COLOR", Integer.valueOf(dzrrVar.a()));
                                    }
                                    if (dzrrVar.b() == dzrt.SIZE) {
                                        hashMap4.put("SIZE", Integer.valueOf(dzrrVar.h()));
                                    }
                                    if (dzrrVar.b() == dzrt.TYPEFACE_LIST) {
                                        hashMap4.put("TYPEFACE_LIST", dyhx.d(dzrrVar.l(), new emwl() { // from class: dyvg
                                            @Override // defpackage.emwl
                                            public final Object apply(Object obj4) {
                                                return Integer.valueOf(((dzrv) obj4).j);
                                            }
                                        }));
                                    }
                                    if (dzrrVar.b() == dzrt.HORIZONTAL_ALIGNMENT) {
                                        hashMap4.put("HORIZONTAL_ALIGNMENT", Integer.valueOf(dzrrVar.e()));
                                    }
                                    if (dzrrVar.b() == dzrt.HYPER_LINK) {
                                        hashMap4.put("HYPER_LINK_V2", ((dzof) dzrrVar.f()).a);
                                    }
                                    return hashMap4;
                                }
                            }));
                            return hashMap3;
                        }
                    }));
                }
                if (dzrhVar.d().g()) {
                    hashMap2.put("SKIP_LEADING_NEWLINE", dzrhVar.d().c());
                }
                return hashMap2;
            }
        }));
        return hashMap;
    }
}
