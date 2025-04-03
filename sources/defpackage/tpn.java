package defpackage;

import android.content.Context;
import com.google.common.util.concurrent.ListenableFuture;
import j$.util.Collection;
import j$.util.Objects;
import j$.util.function.Predicate$CC;
import java.util.function.Predicate;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class tpn implements cigv {
    public static final cskc a = cskc.f("BugleCms", tpn.class);
    public final cins b;
    public final cgxw c;
    public final crue d;
    public final Context e;
    public final errl f;
    public final eisx g;
    private final axkm h;

    public tpn(cgxw cgxwVar, cins cinsVar, crue crueVar, axkm axkmVar, eisx eisxVar, Context context, errl errlVar) {
        this.c = cgxwVar;
        this.b = cinsVar;
        this.d = crueVar;
        this.h = axkmVar;
        this.g = eisxVar;
        this.e = context;
        this.f = errlVar;
    }

    @Override // defpackage.cigv
    public final elfl a(fbzt fbztVar) {
        try {
            fcdo fcdoVar = (fcdo) eyfy.parseFrom(fcdo.a, fbztVar.e, eyfc.a());
            final String str = fbztVar.c;
            final fcek fcekVar = fbztVar.i;
            if (fcekVar == null) {
                fcekVar = fcek.a;
            }
            if (fcdoVar.b != 108) {
                csjb c = a.c();
                c.I("Ignoring Userdata Message without ChangeAccountInfoPush.");
                c.A("messageId", str);
                c.r();
                return elfo.e(true);
            }
            fcko fckoVar = (fcko) fcdoVar.c;
            cskc cskcVar = a;
            csjb c2 = cskcVar.c();
            c2.I("Handling ChangeAccountInfoPush.");
            c2.A("messageId", str);
            c2.r();
            if ((fckoVar.b & 1) == 0) {
                csjb d = cskcVar.d();
                d.I("Ignoring ChangeAccountInfoPush without reachable Ids.");
                d.A("messageId", str);
                d.r();
                return elfo.e(true);
            }
            fclw fclwVar = fckoVar.c;
            if (fclwVar == null) {
                fclwVar = fclw.a;
            }
            int i = fclwVar.c;
            char c3 = i != 0 ? i != 1 ? i != 2 ? i != 3 ? (char) 0 : (char) 5 : (char) 4 : (char) 3 : (char) 2;
            if (c3 == 0 || c3 != 4) {
                csjb c4 = cskcVar.c();
                c4.I("Ignoring ChangeAccountInfoPush as the reachableIds change reason is not dasher disabled.");
                c4.A("messageId", str);
                c4.r();
                return elfo.e(true);
            }
            fclw fclwVar2 = fckoVar.c;
            if (fclwVar2 == null) {
                fclwVar2 = fclw.a;
            }
            if (!Collection.EL.stream(fclwVar2.b).anyMatch(new Predicate() { // from class: tpj
                public final /* synthetic */ Predicate and(Predicate predicate) {
                    return Predicate$CC.$default$and(this, predicate);
                }

                @Override // java.util.function.Predicate
                /* renamed from: negate */
                public final /* synthetic */ Predicate mo439negate() {
                    return Predicate$CC.$default$negate(this);
                }

                public final /* synthetic */ Predicate or(Predicate predicate) {
                    return Predicate$CC.$default$or(this, predicate);
                }

                @Override // java.util.function.Predicate
                public final boolean test(Object obj) {
                    fcek fcekVar2 = (fcek) obj;
                    fcek fcekVar3 = fcekVar;
                    if (fcekVar2 == null || fcekVar3 == null) {
                        return Objects.equals(fcekVar2, fcekVar3);
                    }
                    int i2 = fcekVar2.b;
                    fgtg b = fgtg.b(i2);
                    if (b == null) {
                        b = fgtg.UNRECOGNIZED;
                    }
                    fgtg b2 = fgtg.b(fcekVar3.b);
                    if (b2 == null) {
                        b2 = fgtg.UNRECOGNIZED;
                    }
                    if (b != b2) {
                        return false;
                    }
                    fgtg fgtgVar = fgtg.EMAIL;
                    fgtg b3 = fgtg.b(i2);
                    if (b3 == null) {
                        b3 = fgtg.UNRECOGNIZED;
                    }
                    if (fgtgVar != b3) {
                        return emuz.e(fcekVar2.c, fcekVar3.c);
                    }
                    String str2 = fcekVar2.c;
                    String str3 = fcekVar3.c;
                    int i3 = csji.a;
                    if (str2 == null || str3 == null) {
                        return Objects.equals(str2, str3);
                    }
                    Context context = tpn.this.e;
                    return csji.a(context, str2).equals(csji.a(context, str3));
                }
            })) {
                return this.h.k().i(new eroh() { // from class: tpm
                    @Override // defpackage.eroh
                    public final ListenableFuture a(Object obj) {
                        boolean z = ((axez) obj).e;
                        final String str2 = str;
                        if (z) {
                            final fcek fcekVar2 = fcekVar;
                            final tpn tpnVar = tpn.this;
                            return tpnVar.d.d(tpnVar.g, 1, 1).i(new eroh() { // from class: tpk
                                @Override // defpackage.eroh
                                public final ListenableFuture a(Object obj2) {
                                    tpn tpnVar2 = tpn.this;
                                    tpnVar2.b.r(fcekVar2.c);
                                    csjb c5 = tpn.a.c();
                                    c5.I("Clear gaia registration as dasher account is disabled.");
                                    c5.A("messageId", str2);
                                    c5.r();
                                    return tpnVar2.c.c();
                                }
                            }, tpnVar.f).h(new emwl() { // from class: tpl
                                @Override // defpackage.emwl
                                public final Object apply(Object obj2) {
                                    return true;
                                }
                            }, erpp.a);
                        }
                        csjb c5 = tpn.a.c();
                        c5.I("The CMS feature is already disabled.");
                        c5.A("messageId", str2);
                        c5.r();
                        return elfo.e(true);
                    }
                }, this.f);
            }
            csjb c5 = cskcVar.c();
            c5.I("Ignoring ChangeAccountInfoPush as receiver id is still reachable");
            c5.M("receiverId", fcekVar.c);
            c5.A("messageId", str);
            c5.r();
            return elfo.e(true);
        } catch (eygu unused) {
            csjb e = a.e();
            e.I("Invalid Userdata message.");
            e.A("messageId", fbztVar.c);
            e.r();
            return elfo.e(true);
        }
    }
}
