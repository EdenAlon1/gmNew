package androidx.car.app.model;

import defpackage.cfs;
import defpackage.cic;

/* compiled from: PG */
@cfs
/* loaded from: classes.dex */
public final class ParkedOnlyOnClickListener implements cic {
    private final cic mListener;

    private ParkedOnlyOnClickListener(cic cicVar) {
        this.mListener = cicVar;
    }

    public static ParkedOnlyOnClickListener create(cic cicVar) {
        cicVar.getClass();
        return new ParkedOnlyOnClickListener(cicVar);
    }

    @Override // defpackage.cic
    public void onClick() {
        this.mListener.onClick();
    }
}
