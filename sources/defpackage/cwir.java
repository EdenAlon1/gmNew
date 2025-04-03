package defpackage;

import com.google.android.apps.messaging.startchat.chip.ChipData;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cwir {
    public final List a;
    public final ChipData b;
    public final ChipData c;
    public final cwjb d;
    public final List e;
    private final Set f;

    public cwir(List list, Set set, ChipData chipData, ChipData chipData2, cwjb cwjbVar) {
        cwjbVar.getClass();
        this.a = list;
        this.f = set;
        this.b = chipData;
        this.c = chipData2;
        this.d = cwjbVar;
        if (!list.isEmpty() && ((ChipData) list.get(0)).e) {
            ArrayList arrayList = new ArrayList();
            for (Object obj : list) {
                if (!((ChipData) obj).e) {
                    arrayList.add(obj);
                }
            }
            list = arrayList;
        }
        this.e = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean a(amar amarVar) {
        enqv it = amarVar.b().iterator();
        it.getClass();
        while (it.hasNext()) {
            if (b(((ambh) it.next()).a)) {
                return true;
            }
        }
        return false;
    }

    public final boolean b(aoku aokuVar) {
        if (this.f.isEmpty()) {
            return false;
        }
        return this.f.contains(aokuVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cwir)) {
            return false;
        }
        cwir cwirVar = (cwir) obj;
        return ffkj.e(this.a, cwirVar.a) && ffkj.e(this.f, cwirVar.f) && ffkj.e(this.b, cwirVar.b) && ffkj.e(this.c, cwirVar.c) && this.d == cwirVar.d;
    }

    public final int hashCode() {
        int hashCode = (this.a.hashCode() * 31) + this.f.hashCode();
        ChipData chipData = this.b;
        int hashCode2 = ((hashCode * 31) + (chipData == null ? 0 : chipData.hashCode())) * 31;
        ChipData chipData2 = this.c;
        return ((hashCode2 + (chipData2 != null ? chipData2.hashCode() : 0)) * 31) + this.d.hashCode();
    }

    public final String toString() {
        return "ContactSelectionStateImpl(allChipList=" + this.a + ", allIdentities=" + this.f + ", lastAddedChip=" + this.b + ", lastRemovedChip=" + this.c + ", mode=" + this.d + ")";
    }
}
