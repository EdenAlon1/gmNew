package defpackage;

import android.R;
import com.google.android.apps.messaging.cloudstore.fi.FiAccountConfirmationActivity;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class tev implements eivv {
    public final FiAccountConfirmationActivity a;
    public final axdf b;
    public final dcxh c;
    public int e = 2;
    public boolean d = false;

    public tev(FiAccountConfirmationActivity fiAccountConfirmationActivity, eito eitoVar, axdf axdfVar, dcxh dcxhVar) {
        this.a = fiAccountConfirmationActivity;
        this.b = axdfVar;
        this.c = dcxhVar;
        eitoVar.g(eiwz.g(fiAccountConfirmationActivity));
        eitoVar.e(this);
    }

    @Override // defpackage.eivv
    public final void aa(eivt eivtVar) {
        cg cgVar = new cg(this.a.a());
        eisx a = eivtVar.a();
        tfi tfiVar = (tfi) tfj.a.createBuilder();
        int i = this.e;
        tfiVar.copyOnWrite();
        tfj tfjVar = (tfj) tfiVar.instance;
        int i2 = i - 1;
        if (i == 0) {
            throw null;
        }
        tfjVar.c = i2;
        tfjVar.b |= 1;
        tfj tfjVar2 = (tfj) tfiVar.build();
        tex texVar = new tex();
        fbae.e(texVar);
        ekky.b(texVar, a);
        ekku.a(texVar, tfjVar2);
        cgVar.E(R.id.content, texVar);
        cgVar.c();
    }

    @Override // defpackage.eivv
    public final void ac(eiup eiupVar) {
        throw new IllegalStateException("Unexpected account error in internal activity", eiupVar);
    }

    @Override // defpackage.eivv
    public final /* synthetic */ void ab() {
    }

    @Override // defpackage.eivv
    public final /* synthetic */ void d() {
    }
}
