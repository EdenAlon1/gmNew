package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public abstract class dzim extends dzpg {
    public final String a;
    public final String b;
    public final dzpf c;
    public final emxc d;

    public dzim(String str, String str2, dzpf dzpfVar, emxc emxcVar) {
        if (str == null) {
            throw new NullPointerException("Null id");
        }
        this.a = str;
        if (str2 == null) {
            throw new NullPointerException("Null tachyonAppName");
        }
        this.b = str2;
        if (dzpfVar == null) {
            throw new NullPointerException("Null type");
        }
        this.c = dzpfVar;
        if (emxcVar == null) {
            throw new NullPointerException("Null handlerId");
        }
        this.d = emxcVar;
    }

    @Override // defpackage.dzpg
    public final dzpc a() {
        return new dzil(this);
    }

    @Override // defpackage.dzpg
    public final dzpf b() {
        return this.c;
    }

    @Override // defpackage.dzpg
    public final emxc c() {
        return this.d;
    }

    @Override // defpackage.dzpg
    public final String d() {
        return this.a;
    }

    @Override // defpackage.dzpg
    public final String e() {
        return this.b;
    }

    public final String toString() {
        emxc emxcVar = this.d;
        return "ContactId{id=" + this.a + ", tachyonAppName=" + this.b + ", type=" + this.c.toString() + ", handlerId=" + emxcVar.toString() + "}";
    }
}
