package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dyyz extends dyzd {
    private final dzai a;

    public dyyz(dzai dzaiVar) {
        this.a = dzaiVar;
    }

    @Override // defpackage.dzay
    public final int b() {
        return 2;
    }

    @Override // defpackage.dyzd, defpackage.dzay
    public final dzai c() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof dzay) {
            dzay dzayVar = (dzay) obj;
            if (dzayVar.b() == 2 && this.a.equals(dzayVar.c())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return 1001100;
    }

    public final String toString() {
        return "OneOfType{blockUnblockUsers=BlockUnblockUsers{syncBlockStatus=true}}";
    }
}
