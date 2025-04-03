package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cand {
    public static final cand a;
    public static final cand b;
    public static final cand c;
    private static final /* synthetic */ cand[] d;

    static {
        cand candVar = new cand("ONE_ON_ONE_TEXT", 0);
        a = candVar;
        cand candVar2 = new cand("ONE_ON_ONE_RCS", 1);
        b = candVar2;
        cand candVar3 = new cand("ONE_ON_ONE_E2EE", 2);
        c = candVar3;
        cand[] candVarArr = {candVar, candVar2, candVar3};
        d = candVarArr;
        ffhw.a(candVarArr);
    }

    private cand(String str, int i) {
    }

    public static final cand a(MessageCoreData messageCoreData) {
        messageCoreData.getClass();
        return (messageCoreData.cX() && messageCoreData.cB()) ? c : messageCoreData.cX() ? b : a;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x001b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0018  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final defpackage.cand b(int r3) {
        /*
            r0 = 219(0xdb, float:3.07E-43)
            if (r3 == r0) goto L1e
            switch(r3) {
                case 214: goto L1b;
                case 215: goto L18;
                case 216: goto L1e;
                default: goto L7;
            }
        L7:
            switch(r3) {
                case 235: goto L1e;
                case 236: goto L1b;
                case 237: goto L1e;
                case 238: goto L18;
                default: goto La;
            }
        La:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "Unsupported status("
            java.lang.String r2 = ")"
            java.lang.String r3 = defpackage.a.f(r3, r1, r2)
            r0.<init>(r3)
            throw r0
        L18:
            cand r3 = defpackage.cand.b
            return r3
        L1b:
            cand r3 = defpackage.cand.a
            return r3
        L1e:
            cand r3 = defpackage.cand.c
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cand.b(int):cand");
    }

    public static cand[] values() {
        return (cand[]) d.clone();
    }
}
