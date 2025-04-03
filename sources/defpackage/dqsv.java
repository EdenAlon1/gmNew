package defpackage;

import org.chromium.net.PrivateKeyType;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dqsv implements dtab {
    public final dqpw a;
    public final boolean b;
    public final emyl c;
    public final dqof d;
    public final Integer e;
    public final boolean f;
    public final dqgm g;
    private final dqkd h;

    /* JADX WARN: Multi-variable type inference failed */
    public dqsv() {
        this(null, 0 == true ? 1 : 0, PrivateKeyType.INVALID);
    }

    public static /* synthetic */ dqsv a(dqsv dqsvVar, dqof dqofVar, Integer num, dqgm dqgmVar) {
        dqpw dqpwVar = dqsvVar.a;
        boolean z = dqsvVar.b;
        emyl emylVar = dqsvVar.c;
        dqkd dqkdVar = dqsvVar.h;
        return new dqsv(dqpwVar, z, emylVar, dqofVar, num, false, dqgmVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dqsv)) {
            return false;
        }
        dqsv dqsvVar = (dqsv) obj;
        if (this.a != dqsvVar.a || this.b != dqsvVar.b || !ffkj.e(this.c, dqsvVar.c) || !ffkj.e(this.d, dqsvVar.d) || !ffkj.e(this.e, dqsvVar.e) || this.f != dqsvVar.f || !ffkj.e(this.g, dqsvVar.g)) {
            return false;
        }
        dqkd dqkdVar = dqsvVar.h;
        return ffkj.e(null, null);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        emyl emylVar = this.c;
        int a = (((hashCode + dqsu.a(this.b)) * 31) + (emylVar == null ? 0 : emylVar.hashCode())) * 31;
        dqof dqofVar = this.d;
        int hashCode2 = (a + (dqofVar == null ? 0 : dqofVar.hashCode())) * 31;
        Integer num = this.e;
        int hashCode3 = (((hashCode2 + (num == null ? 0 : num.hashCode())) * 31) + dqsu.a(this.f)) * 31;
        dqgm dqgmVar = this.g;
        return (hashCode3 + (dqgmVar != null ? dqgmVar.hashCode() : 0)) * 31;
    }

    public final String toString() {
        return "EmojiConfiguration(preferencesStrategy=" + this.a + ", showVariantPickerOnFirstVariableEmojiUse=" + this.b + ", emojiSearchManifestFileFlagSupplier=" + this.c + ", selectedEmoji=" + this.d + ", selectedEmojiBackgroundResId=" + this.e + ", showBackspaceButton=" + this.f + ", emojiUsageUserContext=" + this.g + ", emojiUsageFrecencyFactors=null)";
    }

    public dqsv(dqpw dqpwVar, boolean z, emyl emylVar, dqof dqofVar, Integer num, boolean z2, dqgm dqgmVar) {
        dqpwVar.getClass();
        this.a = dqpwVar;
        this.b = z;
        this.c = emylVar;
        this.d = dqofVar;
        this.e = num;
        this.f = z2;
        this.g = dqgmVar;
        this.h = null;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public /* synthetic */ dqsv(defpackage.dqpw r9, defpackage.emyl r10, int r11) {
        /*
            r8 = this;
            r0 = r11 & 1
            if (r0 == 0) goto L6
            dqpw r9 = defpackage.dqpw.b
        L6:
            r1 = r9
            r9 = r11 & 2
            r0 = 0
            if (r9 == 0) goto L11
            dqpw r9 = defpackage.dqpw.a
            if (r1 != r9) goto L11
            r0 = 1
        L11:
            r2 = r0
            r9 = r11 & 4
            if (r9 == 0) goto L17
            r10 = 0
        L17:
            r3 = r10
            r6 = 1
            r7 = 0
            r4 = 0
            r5 = 0
            r0 = r8
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dqsv.<init>(dqpw, emyl, int):void");
    }
}
