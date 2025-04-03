package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dota {
    private final boolean a;
    private final boolean b;

    public dota() {
        this(null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dota)) {
            return false;
        }
        dota dotaVar = (dota) obj;
        boolean z = dotaVar.a;
        boolean z2 = dotaVar.b;
        return true;
    }

    public final int hashCode() {
        return 39584;
    }

    public final String toString() {
        return "Flags(addViewIdToDropdownMenu=false, showIconsForOverflowActions=false)";
    }

    public /* synthetic */ dota(byte[] bArr) {
        this.a = false;
        this.b = false;
    }
}
