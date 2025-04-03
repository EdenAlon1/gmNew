package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dyzm extends dzai {
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof dzai)) {
            return false;
        }
        ((dzai) obj).a();
        return true;
    }

    public final int hashCode() {
        return 1001100;
    }

    public final String toString() {
        return "BlockUnblockUsers{syncBlockStatus=true}";
    }

    @Override // defpackage.dzai
    public final void a() {
    }
}
