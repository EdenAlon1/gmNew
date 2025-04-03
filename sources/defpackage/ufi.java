package defpackage;

import android.net.Uri;

/* compiled from: PG */
/* loaded from: classes2.dex */
public abstract class ufi implements ufd, apph {
    public static ufh m() {
        uen uenVar = new uen();
        eohh eohhVar = eohh.FILE_CHOOSER;
        if (eohhVar == null) {
            throw new NullPointerException("Null contentSource");
        }
        uenVar.a = eohhVar;
        return uenVar;
    }

    @Override // defpackage.apmq
    public abstract Uri c();

    @Override // defpackage.apmq
    public abstract apra fk();

    @Override // defpackage.apmq
    public final /* synthetic */ awap fl() {
        return null;
    }

    @Override // defpackage.doxs
    public final /* synthetic */ doxr fm() {
        return ufc.a(this);
    }

    @Override // defpackage.doxs
    public final /* synthetic */ String fo() {
        return toString();
    }

    @Override // defpackage.apmq
    public final /* synthetic */ boolean fp() {
        return apmp.a(this);
    }

    @Override // defpackage.doxx
    public final /* synthetic */ Object fn() {
        return this;
    }
}
