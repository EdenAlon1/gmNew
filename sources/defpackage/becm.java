package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes7.dex */
final class becm extends bfks {
    private final Boolean a;
    private final Boolean b;
    private final Boolean c;
    private final Boolean d;
    private final Boolean e;
    private final boolean f;
    private final ConversationIdType g;
    private final engw h;
    private final Function i;
    private final Integer j;

    public becm(Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, Boolean bool5, boolean z, ConversationIdType conversationIdType, engw engwVar, Function function, Integer num) {
        this.a = bool;
        this.b = bool2;
        this.c = bool3;
        this.d = bool4;
        this.e = bool5;
        this.f = z;
        this.g = conversationIdType;
        this.h = engwVar;
        this.i = function;
        this.j = num;
    }

    @Override // defpackage.bfks
    public final ConversationIdType a() {
        return this.g;
    }

    @Override // defpackage.bfks
    public final engw b() {
        return this.h;
    }

    @Override // defpackage.bfks
    public final Boolean c() {
        return this.e;
    }

    @Override // defpackage.bfks
    public final Boolean d() {
        return this.a;
    }

    @Override // defpackage.bfks
    public final Boolean e() {
        return this.b;
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x009f, code lost:
    
        if (r5.i() == null) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00ac, code lost:
    
        r1 = r4.j;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00ae, code lost:
    
        if (r1 != null) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00b4, code lost:
    
        if (r5.h() != null) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00c2, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00bf, code lost:
    
        if (r1.equals(r5.h()) != false) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00aa, code lost:
    
        if (r1 != false) goto L55;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean equals(java.lang.Object r5) {
        /*
            r4 = this;
            r0 = 1
            if (r5 != r4) goto L4
            return r0
        L4:
            boolean r1 = r5 instanceof defpackage.bfks
            r2 = 0
            if (r1 == 0) goto Lc3
            bfks r5 = (defpackage.bfks) r5
            java.lang.Boolean r1 = r4.a
            if (r1 != 0) goto L16
            java.lang.Boolean r1 = r5.d()
            if (r1 != 0) goto Lc3
            goto L20
        L16:
            java.lang.Boolean r3 = r5.d()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto Lc3
        L20:
            java.lang.Boolean r1 = r4.b
            if (r1 != 0) goto L2b
            java.lang.Boolean r1 = r5.e()
            if (r1 != 0) goto Lc3
            goto L35
        L2b:
            java.lang.Boolean r3 = r5.e()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto Lc3
        L35:
            java.lang.Boolean r1 = r4.c
            if (r1 != 0) goto L40
            java.lang.Boolean r1 = r5.g()
            if (r1 != 0) goto Lc3
            goto L4a
        L40:
            java.lang.Boolean r3 = r5.g()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto Lc3
        L4a:
            r5.k()
            java.lang.Boolean r1 = r4.d
            if (r1 != 0) goto L58
            java.lang.Boolean r1 = r5.f()
            if (r1 != 0) goto Lc3
            goto L62
        L58:
            java.lang.Boolean r3 = r5.f()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto Lc3
        L62:
            java.lang.Boolean r1 = r4.e
            if (r1 != 0) goto L6d
            java.lang.Boolean r1 = r5.c()
            if (r1 != 0) goto Lc3
            goto L77
        L6d:
            java.lang.Boolean r3 = r5.c()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto Lc3
        L77:
            boolean r1 = r4.f
            boolean r3 = r5.j()
            if (r1 != r3) goto Lc3
            com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType r1 = r4.g
            com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType r3 = r5.a()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto Lc3
            engw r1 = r4.h
            engw r3 = r5.b()
            boolean r1 = defpackage.enkr.h(r1, r3)
            if (r1 == 0) goto Lc3
            java.util.function.Function r1 = r4.i
            if (r1 != 0) goto La2
            java.util.function.Function r1 = r5.i()
            if (r1 != 0) goto Lc3
            goto Lac
        La2:
            java.util.function.Function r3 = r5.i()
            boolean r1 = defpackage.afg$$ExternalSyntheticApiModelOutline0.m113m(r1, r3)
            if (r1 == 0) goto Lc3
        Lac:
            java.lang.Integer r1 = r4.j
            if (r1 != 0) goto Lb7
            java.lang.Integer r5 = r5.h()
            if (r5 != 0) goto Lc3
            goto Lc2
        Lb7:
            java.lang.Integer r5 = r5.h()
            boolean r5 = r1.equals(r5)
            if (r5 != 0) goto Lc2
            goto Lc3
        Lc2:
            return r0
        Lc3:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.becm.equals(java.lang.Object):boolean");
    }

    @Override // defpackage.bfks
    public final Boolean f() {
        return this.d;
    }

    @Override // defpackage.bfks
    public final Boolean g() {
        return this.c;
    }

    @Override // defpackage.bfks
    public final Integer h() {
        return this.j;
    }

    public final int hashCode() {
        Boolean bool = this.a;
        int hashCode = bool == null ? 0 : bool.hashCode();
        Boolean bool2 = this.b;
        int hashCode2 = (((hashCode ^ 1000003) * 1000003) ^ (bool2 == null ? 0 : bool2.hashCode())) * 1000003;
        Boolean bool3 = this.c;
        int hashCode3 = hashCode2 ^ (bool3 == null ? 0 : bool3.hashCode());
        Boolean bool4 = this.d;
        int hashCode4 = ((hashCode3 * (-721379959)) ^ (bool4 == null ? 0 : bool4.hashCode())) * 1000003;
        Boolean bool5 = this.e;
        int hashCode5 = (((((((hashCode4 ^ (bool5 == null ? 0 : bool5.hashCode())) * 1000003) ^ (true != this.f ? 1237 : 1231)) * 1000003) ^ this.g.hashCode()) * 1000003) ^ this.h.hashCode()) * 1000003;
        Function function = this.i;
        int hashCode6 = (hashCode5 ^ (function == null ? 0 : function.hashCode())) * 1000003;
        Integer num = this.j;
        return hashCode6 ^ (num != null ? num.hashCode() : 0);
    }

    @Override // defpackage.bfks
    public final Function i() {
        return this.i;
    }

    @Override // defpackage.bfks
    public final boolean j() {
        return this.f;
    }

    public final String toString() {
        Function function = this.i;
        engw engwVar = this.h;
        return "ConversationListFromConversationToParticipantsQueryBuilder{whereArchived=" + this.a + ", whereNotArchived=" + this.b + ", whereSpam=" + this.c + ", whereCloudSync=null, whereNotCloudSync=" + this.d + ", whereActiveRcsGroup=" + this.e + ", whereApprovedByParent=" + this.f + ", conversationId=" + this.g.toString() + ", conversationIds=" + engwVar.toString() + ", additionalPredicate=" + String.valueOf(function) + ", limit=" + this.j + "}";
    }

    @Override // defpackage.bfks
    public final void k() {
    }
}
