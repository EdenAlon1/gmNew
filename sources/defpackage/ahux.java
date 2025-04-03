package defpackage;

import com.google.android.apps.messaging.multishare.chip.ChipData;
import com.google.android.apps.messaging.multishare.chip.ChipId;
import com.google.android.apps.messaging.shared.api.messaging.conversation.ConversationId;
import java.util.List;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class ahux implements ahut {
    private final List a;
    private final Set b;
    private final ChipData c;
    private final ChipData d;

    /* JADX WARN: Multi-variable type inference failed */
    public ahux() {
        this(null, 0 == true ? 1 : 0, 15);
    }

    @Override // defpackage.ahut
    public final ChipData a() {
        return this.c;
    }

    @Override // defpackage.ahut
    public final ChipData b() {
        return this.d;
    }

    @Override // defpackage.ahut
    public final List c() {
        return this.a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.ahut
    public final boolean d(amar amarVar) {
        enqv it = amarVar.b().iterator();
        it.getClass();
        while (it.hasNext()) {
            if (f(((ambh) it.next()).a)) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.ahut
    public final boolean e(ConversationId conversationId) {
        if (this.b.isEmpty()) {
            return false;
        }
        return this.b.contains(new ChipId.Conversation(conversationId));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ahux)) {
            return false;
        }
        ahux ahuxVar = (ahux) obj;
        return ffkj.e(this.a, ahuxVar.a) && ffkj.e(this.b, ahuxVar.b) && ffkj.e(this.c, ahuxVar.c) && ffkj.e(this.d, ahuxVar.d);
    }

    @Override // defpackage.ahut
    public final boolean f(aoku aokuVar) {
        if (this.b.isEmpty()) {
            return false;
        }
        return this.b.contains(new ChipId.Identity(aokuVar));
    }

    public final int hashCode() {
        int hashCode = (this.a.hashCode() * 31) + this.b.hashCode();
        ChipData chipData = this.c;
        int hashCode2 = ((hashCode * 31) + (chipData == null ? 0 : chipData.hashCode())) * 31;
        ChipData chipData2 = this.d;
        return hashCode2 + (chipData2 != null ? chipData2.hashCode() : 0);
    }

    public final String toString() {
        return "ContactSelectionStateImpl(allChipList=" + this.a + ", allIdentities=" + this.b + ", lastAddedChip=" + this.c + ", lastRemovedChip=" + this.d + ")";
    }

    public ahux(List list, Set set, ChipData chipData, ChipData chipData2) {
        list.getClass();
        set.getClass();
        this.a = list;
        this.b = set;
        this.c = chipData;
        this.d = chipData2;
    }

    public /* synthetic */ ahux(List list, Set set, int i) {
        this((i & 1) != 0 ? ffel.a : list, (i & 2) != 0 ? ffen.a : set, null, null);
    }
}
