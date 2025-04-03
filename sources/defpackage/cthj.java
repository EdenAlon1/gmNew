package defpackage;

import com.google.knowledge.cerebra.sense.textclassifier.tclib.TextClassifierLib;
import j$.util.Optional;
import j$.util.function.Function$CC;
import java.util.List;
import java.util.function.Function;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cthj implements ctgw {
    private final cwln a;
    private final errl b;

    public cthj(cwln cwlnVar, errl errlVar) {
        this.a = cwlnVar;
        this.b = errlVar;
    }

    @Override // defpackage.ctgw
    public final elfl a(final String str) {
        return this.a.a().h(new emwl() { // from class: cthg
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                final String str2 = str;
                return ((Optional) obj).map(new Function() { // from class: cthi
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo448andThen(Function function) {
                        return Function$CC.$default$andThen(this, function);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj2) {
                        TextClassifierLib textClassifierLib = (TextClassifierLib) obj2;
                        ewza ewzaVar = new ewza();
                        int i = engw.d;
                        engr engrVar = new engr();
                        if (((Boolean) ctim.b.e()).booleanValue()) {
                            engrVar.h("entity");
                        }
                        if (((Boolean) ctim.c.e()).booleanValue()) {
                            engrVar.h("address");
                        }
                        if (((Boolean) ctim.d.e()).booleanValue()) {
                            engrVar.h("contact");
                        }
                        if (((Boolean) ctim.e.e()).booleanValue()) {
                            engrVar.h("datetime");
                            engrVar.h("date");
                        }
                        if (((Boolean) ctim.f.e()).booleanValue()) {
                            engrVar.h("url");
                        }
                        if (((Boolean) ctim.g.e()).booleanValue()) {
                            engrVar.h("email");
                        }
                        if (((Boolean) ctim.h.e()).booleanValue()) {
                            engrVar.h("phone");
                        }
                        String str3 = str2;
                        ewzaVar.b = engrVar.g();
                        ewzaVar.b();
                        ewzb a = ewzaVar.a();
                        exak exakVar = new exak(str3);
                        ewzf ewzfVar = ewzf.RAW;
                        exakVar.a = a;
                        return textClassifierLib.g(ewyt.a(ewzfVar, exakVar, null));
                    }

                    public final /* synthetic */ Function compose(Function function) {
                        return Function$CC.$default$compose(this, function);
                    }
                });
            }
        }, this.b).h(new emwl() { // from class: cthh
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                final String str2 = str;
                return (List) ((Optional) obj).map(new Function() { // from class: cthe
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo448andThen(Function function) {
                        return Function$CC.$default$andThen(this, function);
                    }

                    /* JADX WARN: Multi-variable type inference failed */
                    /* JADX WARN: Removed duplicated region for block: B:20:0x0073  */
                    /* JADX WARN: Removed duplicated region for block: B:9:0x003f  */
                    @Override // java.util.function.Function
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                        To view partially-correct add '--show-bad-code' argument
                    */
                    public final java.lang.Object apply(java.lang.Object r27) {
                        /*
                            Method dump skipped, instructions count: 2324
                            To view this dump add '--comments-level debug' option
                        */
                        throw new UnsupportedOperationException("Method not decompiled: defpackage.cthe.apply(java.lang.Object):java.lang.Object");
                    }

                    public final /* synthetic */ Function compose(Function function) {
                        return Function$CC.$default$compose(this, function);
                    }
                }).orElseGet(new Supplier() { // from class: cthf
                    @Override // java.util.function.Supplier
                    public final Object get() {
                        int i = engw.d;
                        return enou.a;
                    }
                });
            }
        }, this.b);
    }
}
