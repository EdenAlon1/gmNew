package defpackage;

import j$.time.Instant;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ehzb extends eibq {
    public eibr a;
    public String b;
    public Instant c;
    public String d;

    @Override // defpackage.eibq
    public final eibr a() {
        eibr eibrVar = this.a;
        if (eibrVar != null) {
            return eibrVar;
        }
        throw new IllegalStateException("Property \"type\" has not been set");
    }

    @Override // defpackage.eibq
    public final Optional b() {
        String str = this.d;
        return str == null ? Optional.empty() : Optional.of(str);
    }

    @Override // defpackage.eibq
    public final void c(String str) {
        if (str == null) {
            throw new NullPointerException("Null status");
        }
        this.d = str;
    }

    @Override // defpackage.eibq
    public final void d(eibr eibrVar) {
        if (eibrVar == null) {
            throw new NullPointerException("Null type");
        }
        this.a = eibrVar;
    }
}
