package defpackage;

import android.content.Context;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final /* synthetic */ class ecvu {
    public static ecvo a(Context context, final fazb fazbVar, final ffbr ffbrVar, final ffbr ffbrVar2, final ffbr ffbrVar3) {
        Context context2 = ecvo.a;
        final ecvn ecvnVar = new ecvn();
        ecvnVar.a = context;
        fazbVar.getClass();
        ecvnVar.b = new emyl() { // from class: ecvr
            @Override // defpackage.emyl
            public final Object get() {
                return (errm) fazb.this.b();
            }
        };
        final emyl emylVar = new emyl() { // from class: ecvs
            @Override // defpackage.emyl
            public final Object get() {
                return (emxc) ffbr.this.b();
            }
        };
        ecvnVar.c = new emyl() { // from class: ecvm
            @Override // defpackage.emyl
            public final Object get() {
                ecvn ecvnVar2 = ecvn.this;
                return (ecxc) ((emxc) emylVar.get()).d(ecvo.d(ecvnVar2.a));
            }
        };
        ecvnVar.d = new emyl() { // from class: ecvs
            @Override // defpackage.emyl
            public final Object get() {
                return (emxc) ffbr.this.b();
            }
        };
        ecvnVar.e = new emyl() { // from class: ecvt
            @Override // defpackage.emyl
            public final Object get() {
                return (efbm) ffbr.this.b();
            }
        };
        return ecvnVar.a();
    }
}
