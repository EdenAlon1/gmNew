package defpackage;

import android.app.Activity;
import android.os.Bundle;

/* compiled from: PG */
/* loaded from: classes5.dex */
public abstract class efpe extends ea {
    protected fajr a;
    protected fahq b;
    protected Integer c;

    static Bundle a(fajr fajrVar, Integer num, int i) {
        Bundle bundle = new Bundle();
        bundle.putByteArray("Question", fajrVar.toByteArray());
        if (num != null) {
            bundle.putInt("DisplayLogoResId", num.intValue());
        }
        bundle.putInt("QuestionIndex", i);
        return bundle;
    }

    protected final efsj b() {
        efsj efsjVar;
        Activity b;
        Object z = z();
        lkr lkrVar = this.E;
        if (lkrVar instanceof efsj) {
            return (efsj) lkrVar;
        }
        if (!(z instanceof efsj) || (b = (efsjVar = (efsj) z).b()) == null || b.isFinishing() || b.isDestroyed()) {
            return null;
        }
        return efsjVar;
    }

    public abstract fain e();

    @Override // defpackage.ea
    public void h(Bundle bundle) {
        super.h(bundle);
        Bundle bundle2 = this.m;
        byte[] byteArray = bundle2.getByteArray("Question");
        if (byteArray != null) {
            this.a = (fajr) efow.c(fajr.a, byteArray);
        }
        this.c = bundle2.containsKey("DisplayLogoResId") ? Integer.valueOf(bundle2.getInt("DisplayLogoResId", 0)) : null;
        bundle2.getInt("QuestionIndex");
        byte[] byteArray2 = bundle2.getByteArray("Completion");
        if (byteArray2 != null) {
            this.b = (fahq) efow.c(fahq.b, byteArray2);
        }
    }

    public abstract void p();

    public abstract void q(String str);

    public void f() {
    }
}
