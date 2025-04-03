package defpackage;

import com.google.android.apps.messaging.conversation.draft.model.GalleryContent;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class aeth extends ffhv implements ffjm {
    Object a;
    Object b;
    Object c;
    int d;
    int e;
    final /* synthetic */ aetk f;
    final /* synthetic */ GalleryContent g;
    final /* synthetic */ int h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aeth(aetk aetkVar, GalleryContent galleryContent, int i, ffgu ffguVar) {
        super(2, ffguVar);
        this.f = aetkVar;
        this.g = galleryContent;
        this.h = i;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((aeth) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x00a7, code lost:
    
        if (r4 != r0) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0047, code lost:
    
        if (r9 != r0) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0066, code lost:
    
        if (r9 != r0) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0035, code lost:
    
        if (r9 != r0) goto L13;
     */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x00ad  */
    @Override // defpackage.ffhp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.Object r9) {
        /*
            r8 = this;
            ffhh r0 = defpackage.ffhh.a
            int r1 = r8.e
            r2 = 3
            r3 = 2
            r4 = 1
            if (r1 == 0) goto L28
            if (r1 == r4) goto L24
            if (r1 == r3) goto L20
            if (r1 == r2) goto L1c
            int r0 = r8.d
            java.lang.Object r1 = r8.c
            java.lang.Object r2 = r8.b
            java.lang.Object r3 = r8.a
            defpackage.ffci.b(r9)
            goto Lab
        L1c:
            defpackage.ffci.b(r9)
            goto L68
        L20:
            defpackage.ffci.b(r9)
            goto L49
        L24:
            defpackage.ffci.b(r9)
            goto L37
        L28:
            defpackage.ffci.b(r9)
            aetk r9 = r8.f
            r8.e = r4
            aepg r9 = r9.e
            java.lang.Object r9 = r9.b(r8)
            if (r9 == r0) goto Lc7
        L37:
            doxj r9 = (defpackage.doxj) r9
            if (r9 != 0) goto L4d
            aetk r9 = r8.f
            com.google.android.apps.messaging.conversation.draft.model.GalleryContent r1 = r8.g
            int r2 = r8.h
            r8.e = r3
            java.lang.Object r9 = r9.b(r1, r2, r8)
            if (r9 == r0) goto Lc7
        L49:
            drwg r9 = (defpackage.drwg) r9
        L4b:
            r3 = r9
            goto L6b
        L4d:
            aetk r1 = r8.f
            aetf r3 = new aetf
            r3.<init>(r1)
            com.google.android.apps.messaging.conversation.draft.model.GalleryContent r4 = r8.g
            int r5 = r8.h
            aetg r6 = new aetg
            r7 = 0
            r6.<init>(r1, r4, r5, r7)
            r8.e = r2
            druy r1 = r1.d
            java.lang.Object r9 = r1.b(r9, r3, r6, r8)
            if (r9 == r0) goto Lc7
        L68:
            drwg r9 = (defpackage.drwg) r9
            goto L4b
        L6b:
            cfva r9 = defpackage.cjja.a
            emyl r9 = defpackage.cjja.g
            java.lang.Object r9 = r9.get()
            cfup r9 = (defpackage.cfup) r9
            java.lang.Object r9 = r9.e()
            java.lang.Boolean r9 = (java.lang.Boolean) r9
            boolean r9 = r9.booleanValue()
            if (r9 == 0) goto Lb7
            aetk r9 = r8.f
            com.google.android.apps.messaging.conversation.draft.model.GalleryContent r2 = r8.g
            int r1 = r8.h
            ea r9 = r9.b
            boolean r4 = r9.aI()
            if (r4 != 0) goto La9
            lkk r4 = r9.P()
            r4.getClass()
            lki r5 = defpackage.lki.ON_RESUME
            r8.a = r3
            r8.b = r2
            r8.c = r9
            r8.d = r1
            r6 = 4
            r8.e = r6
            java.lang.Object r4 = defpackage.dsks.b(r4, r5, r8)
            if (r4 == r0) goto Lc7
        La9:
            r0 = r1
            r1 = r9
        Lab:
            if (r3 == 0) goto Lc4
            drwg r3 = (defpackage.drwg) r3
            com.google.android.apps.messaging.conversation.draft.model.GalleryContent r2 = (com.google.android.apps.messaging.conversation.draft.model.GalleryContent) r2
            ea r1 = (defpackage.ea) r1
            defpackage.aetl.a(r1, r2, r3, r0)
            goto Lc4
        Lb7:
            if (r3 == 0) goto Lc4
            aetk r9 = r8.f
            com.google.android.apps.messaging.conversation.draft.model.GalleryContent r0 = r8.g
            int r1 = r8.h
            ea r9 = r9.b
            defpackage.aetl.a(r9, r0, r3, r1)
        Lc4:
            ffcu r9 = defpackage.ffcu.a
            return r9
        Lc7:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aeth.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new aeth(this.f, this.g, this.h, ffguVar);
    }
}
