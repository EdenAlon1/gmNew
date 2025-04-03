package defpackage;

import android.app.Notification;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cind implements cink {
    public static final /* synthetic */ int e = 0;
    public final cthp a;
    public final cinj b;
    public final String c;
    public final Optional d;

    public cind(cthp cthpVar, cinj cinjVar, String str, cipf cipfVar) {
        this.a = cthpVar;
        this.b = cinjVar;
        this.c = str;
        this.d = Optional.ofNullable(cipfVar);
    }

    @Override // defpackage.cink
    public final /* synthetic */ int a() {
        return cini.a(this);
    }

    @Override // defpackage.cink
    public final Notification b() {
        throw new UnsupportedOperationException();
    }

    @Override // defpackage.cink
    public final cinj c() {
        return this.b;
    }

    @Override // defpackage.cink
    public final String d() {
        return null;
    }
}
