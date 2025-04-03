package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aibo {
    public final aiba a;
    public final List b;
    public final boolean c;

    public aibo() {
        this(false, 7);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aibo)) {
            return false;
        }
        aibo aiboVar = (aibo) obj;
        return ffkj.e(this.a, aiboVar.a) && ffkj.e(this.b, aiboVar.b) && this.c == aiboVar.c;
    }

    public final int hashCode() {
        aiba aibaVar = this.a;
        return ((((aibaVar == null ? 0 : aibaVar.hashCode()) * 31) + this.b.hashCode()) * 31) + (true != this.c ? 1237 : 1231);
    }

    public final String toString() {
        return "ConversationUiData(loadText=" + this.a + ", entries=" + this.b + ", loaded=" + this.c + ")";
    }

    public aibo(aiba aibaVar, List list, boolean z) {
        list.getClass();
        this.a = aibaVar;
        this.b = list;
        this.c = z;
    }

    public /* synthetic */ aibo(boolean z, int i) {
        this(null, (i & 2) != 0 ? ffel.a : null, z & ((i & 4) == 0));
    }
}
