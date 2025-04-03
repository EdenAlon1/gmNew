package defpackage;

import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class anvc {
    public final engw a;
    public final engw b;
    public final Optional c;
    public final boolean d;
    public final Integer e;
    public final boolean f;
    public final boolean g;
    public final int h;

    public anvc(engw engwVar, engw engwVar2, Optional optional, int i, boolean z, Integer num, boolean z2, boolean z3) {
        engwVar.getClass();
        engwVar2.getClass();
        optional.getClass();
        this.a = engwVar;
        this.b = engwVar2;
        this.c = optional;
        this.h = i;
        this.d = z;
        this.e = num;
        this.f = z2;
        this.g = z3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof anvc)) {
            return false;
        }
        anvc anvcVar = (anvc) obj;
        return ffkj.e(this.a, anvcVar.a) && ffkj.e(this.b, anvcVar.b) && ffkj.e(this.c, anvcVar.c) && this.h == anvcVar.h && this.d == anvcVar.d && ffkj.e(this.e, anvcVar.e) && this.f == anvcVar.f && this.g == anvcVar.g;
    }

    public final int hashCode() {
        int hashCode = (((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode();
        Integer num = this.e;
        return (((((((((hashCode * 31) + this.h) * 31) + anvb.a(this.d)) * 31) + (num == null ? 0 : num.hashCode())) * 31) + anvb.a(this.f)) * 31) + anvb.a(this.g);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FindConversationFilter(requiredRecipients=");
        sb.append(this.a);
        sb.append(", optionalRecipients=");
        sb.append(this.b);
        sb.append(", name=");
        sb.append(this.c);
        sb.append(", matchMode=");
        int i = this.h;
        sb.append((Object) (i != 1 ? i != 2 ? i != 3 ? "EXACT_RECIPIENTS_MATCH" : "BEST_MATCH" : "PARTIAL_MATCH" : "EXACT_MATCH"));
        sb.append(", isGroup=");
        sb.append(this.d);
        sb.append(", limit=");
        sb.append(this.e);
        sb.append(", filterInvalidRcsGroups=");
        sb.append(this.f);
        sb.append(", filterParentUnapprovedConversations=");
        sb.append(this.g);
        sb.append(")");
        return sb.toString();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public /* synthetic */ anvc(defpackage.engw r10, defpackage.engw r11, j$.util.Optional r12, int r13, boolean r14, java.lang.Integer r15, boolean r16, boolean r17, int r18) {
        /*
            r9 = this;
            r0 = r18
            r1 = r0 & 2
            if (r1 == 0) goto La
            int r11 = defpackage.engw.d
            engw r11 = defpackage.enou.a
        La:
            r2 = r11
            r11 = r0 & 4
            if (r11 == 0) goto L13
            j$.util.Optional r12 = j$.util.Optional.empty()
        L13:
            r3 = r12
            r11 = r0 & 16
            r12 = 0
            r1 = 1
            if (r11 == 0) goto L1c
            r11 = r12
            goto L1d
        L1c:
            r11 = r1
        L1d:
            r5 = r11 & r14
            r11 = r0 & 32
            if (r11 == 0) goto L26
            r11 = 0
            r6 = r11
            goto L27
        L26:
            r6 = r15
        L27:
            r11 = r0 & 64
            if (r11 == 0) goto L2d
            r11 = r12
            goto L2e
        L2d:
            r11 = r1
        L2e:
            r7 = r11 & r16
            r11 = r0 & 128(0x80, float:1.794E-43)
            if (r11 == 0) goto L35
            goto L36
        L35:
            r12 = r1
        L36:
            r8 = r12 & r17
            r0 = r9
            r1 = r10
            r4 = r13
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.anvc.<init>(engw, engw, j$.util.Optional, int, boolean, java.lang.Integer, boolean, boolean, int):void");
    }
}
