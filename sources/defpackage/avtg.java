package defpackage;

import j$.time.Duration;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class avtg implements ffbr {
    private final avlg a;

    public avtg(avlg avlgVar) {
        this.a = avlgVar;
    }

    @Override // defpackage.ffbr, defpackage.ffbq
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final avtj b() {
        avtf avtfVar = new avtf();
        Object b = this.a.a.b();
        b.getClass();
        Duration ofSeconds = Duration.ofSeconds(((Number) b).longValue());
        ofSeconds.getClass();
        avtfVar.c(ofSeconds);
        Object b2 = this.a.b.b();
        b2.getClass();
        Duration ofSeconds2 = Duration.ofSeconds(((Number) b2).longValue());
        ofSeconds2.getClass();
        avtfVar.b(ofSeconds2);
        return avtfVar.a();
    }
}
