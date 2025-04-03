package defpackage;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.android.vcard.VCardConfig;
import com.google.android.apps.messaging.gaia.expresssignin.BugleExpressSignInActivity;
import com.google.common.util.concurrent.ListenableFuture;
import j$.util.function.Function$CC;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class admh implements eivp, eivq {
    final errl a;
    private final Context b;
    private final cgfd c;
    private final ffbr d;

    public admh(Context context, cgfd cgfdVar, ffbr ffbrVar, errl errlVar) {
        this.b = context;
        this.c = cgfdVar;
        this.d = ffbrVar;
        this.a = errlVar;
    }

    @Override // defpackage.eivl
    public final ListenableFuture a(eivr eivrVar) {
        Bundle extras = ((eiwu) eivrVar).a.getExtras();
        Intent a = akuv.c(this.b, BugleExpressSignInActivity.class, "android.intent.action.VIEW").a();
        if (extras != null) {
            a.putExtras(extras);
        }
        if (a.getIntExtra("EXPRESS_SIGN_IN_FLOW_KEY", -1) == admj.d.j && !a.hasExtra("LAUNCH_CONTEXT")) {
            a.putExtra("LAUNCH_CONTEXT", "NOT_SIGNED_IN");
        }
        return erqt.i(a);
    }

    @Override // defpackage.eivp
    public final ListenableFuture b(final Intent intent) {
        if (csgj.a() && ((Boolean) ((cfup) csfu.a.get()).e()).booleanValue() && intent.getIntExtra("EXPRESS_SIGN_IN_FLOW_KEY", -1) == admj.b.j) {
            return ((axkm) this.d.b()).A(new Function() { // from class: axhc
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo448andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    axep axepVar = (axep) obj;
                    cskc cskcVar = axkm.a;
                    axepVar.copyOnWrite();
                    axez axezVar = (axez) axepVar.instance;
                    axez axezVar2 = axez.a;
                    axezVar.b |= VCardConfig.FLAG_REFRAIN_QP_TO_NAME_PROPERTIES;
                    axezVar.A = true;
                    return axepVar;
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            }).h(new emwl() { // from class: admf
                @Override // defpackage.emwl
                public final Object apply(Object obj) {
                    return intent;
                }
            }, this.a);
        }
        final cgfd cgfdVar = this.c;
        return cgfdVar.c.j(new emwl() { // from class: cgei
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                ejui ejuiVar = cgfd.a;
                cgdx cgdxVar = (cgdx) ((cgea) obj).toBuilder();
                cgdxVar.copyOnWrite();
                cgea cgeaVar = (cgea) cgdxVar.instance;
                cgeaVar.b |= 1;
                cgeaVar.c = true;
                return (cgea) cgdxVar.build();
            }
        }).h(new emwl() { // from class: cgej
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                cgfd.this.e();
                return null;
            }
        }, cgfdVar.d).h(new emwl() { // from class: admg
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                return intent;
            }
        }, this.a);
    }
}
