package defpackage;

import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aalz implements aoas {
    private final String a;
    private final long b;
    private final String c;
    private final aoav d = aoav.f;

    public aalz(aamb aambVar, appu appuVar) {
        this.a = aambVar.a.getString(R.string.calendar_suggestion_event_description);
        this.b = ((aqdp) appuVar).a;
        this.c = appuVar.a();
    }

    @Override // defpackage.aoax
    public final aoav a() {
        return this.d;
    }

    @Override // defpackage.aoax
    public final String b() {
        return this.c;
    }

    @Override // defpackage.aoas
    public final Long c() {
        return null;
    }

    @Override // defpackage.aoas
    public final Long d() {
        return Long.valueOf(this.b);
    }

    @Override // defpackage.aoas
    public final String e() {
        return this.a;
    }

    @Override // defpackage.aoas
    public final String f() {
        return null;
    }

    @Override // defpackage.aoas
    public final String g() {
        return null;
    }
}
