package defpackage;

import j$.time.Instant;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class amqc implements ampp {
    final /* synthetic */ ckkz a;
    final /* synthetic */ eiks b;

    public amqc(ckkz ckkzVar, eiks eiksVar) {
        this.a = ckkzVar;
        this.b = eiksVar;
    }

    @Override // defpackage.ampp
    public final Instant a() {
        Instant ofEpochMilli = Instant.ofEpochMilli(this.b.b);
        ofEpochMilli.getClass();
        return ofEpochMilli;
    }

    @Override // defpackage.ampp
    public final Integer b() {
        ckkz ckkzVar = this.a;
        if ((ckkzVar.b & 1) != 0) {
            return Integer.valueOf(ckkzVar.c);
        }
        return null;
    }
}
