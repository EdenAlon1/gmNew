package defpackage;

import android.os.Parcelable;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class aygj implements Parcelable.Creator {
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0033, code lost:
    
        if (r7.equals("AUDIO") == false) goto L16;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x004d  */
    @Override // android.os.Parcelable.Creator
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final /* bridge */ /* synthetic */ java.lang.Object createFromParcel(android.os.Parcel r7) {
        /*
            r6 = this;
            r7.getClass()
            java.lang.Class<aygk> r0 = defpackage.aygk.class
            aygk r1 = new aygk
            java.lang.ClassLoader r0 = r0.getClassLoader()
            android.os.Parcelable r0 = r7.readParcelable(r0)
            com.google.android.apps.messaging.shared.conversation.draft.IncomingDraft r0 = (com.google.android.apps.messaging.shared.conversation.draft.IncomingDraft) r0
            int r2 = r7.readInt()
            r3 = 0
            if (r2 != 0) goto L19
            goto L4e
        L19:
            java.lang.String r7 = r7.readString()
            int r2 = r7.hashCode()
            r4 = -1359909864(0xffffffffaef16c18, float:-1.09786125E-10)
            r5 = 1
            if (r2 == r4) goto L36
            r4 = 62628790(0x3bba3b6, float:1.1028458E-36)
            if (r2 == r4) goto L2d
            goto L40
        L2d:
            java.lang.String r2 = "AUDIO"
            boolean r7 = r7.equals(r2)
            if (r7 == 0) goto L40
            goto L41
        L36:
            java.lang.String r2 = "CAMERA_GALLERY"
            boolean r7 = r7.equals(r2)
            if (r7 == 0) goto L40
            r3 = r5
            goto L41
        L40:
            r3 = -1
        L41:
            if (r3 == 0) goto L4d
            if (r3 != r5) goto L47
            r3 = 2
            goto L4e
        L47:
            java.lang.IllegalArgumentException r7 = new java.lang.IllegalArgumentException
            r7.<init>()
            throw r7
        L4d:
            r3 = r5
        L4e:
            r1.<init>(r0, r3)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aygj.createFromParcel(android.os.Parcel):java.lang.Object");
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new aygk[i];
    }
}
