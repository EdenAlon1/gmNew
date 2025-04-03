package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public class eyha {
    protected volatile eyhs a;
    public volatile eyee b;
    private volatile boolean c;

    public final eyee a() {
        if (this.b != null) {
            return this.b;
        }
        synchronized (this) {
            if (this.b != null) {
                return this.b;
            }
            if (this.a == null) {
                this.b = eyee.b;
            } else {
                this.b = this.a.toByteString();
            }
            return this.b;
        }
    }

    public final eyhs b(eyhs eyhsVar) {
        if (this.a == null) {
            synchronized (this) {
                if (this.a == null) {
                    try {
                        this.a = eyhsVar;
                        this.b = eyee.b;
                    } catch (eygu unused) {
                        this.c = true;
                        this.a = eyhsVar;
                        this.b = eyee.b;
                    }
                }
            }
        }
        return this.a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof eyha)) {
            return false;
        }
        eyha eyhaVar = (eyha) obj;
        eyhs eyhsVar = this.a;
        eyhs eyhsVar2 = eyhaVar.a;
        return (eyhsVar == null && eyhsVar2 == null) ? a().equals(eyhaVar.a()) : (eyhsVar == null || eyhsVar2 == null) ? eyhsVar != null ? eyhsVar.equals(eyhaVar.b(eyhsVar.getDefaultInstanceForType())) : b(eyhsVar2.getDefaultInstanceForType()).equals(eyhsVar2) : eyhsVar.equals(eyhsVar2);
    }

    public int hashCode() {
        return 1;
    }
}
