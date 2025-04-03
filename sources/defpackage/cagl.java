package defpackage;

import java.util.Set;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cagl extends ffhv implements ffjm {
    int a;
    final /* synthetic */ cagm b;
    final /* synthetic */ Set c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cagl(cagm cagmVar, Set set, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = cagmVar;
        this.c = set;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cagl) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x006c, code lost:
    
        if (r8 != r0) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:3:0x000a, code lost:
    
        if (r1 != 1) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x007e, code lost:
    
        if (r8 == r0) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0085, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0081, code lost:
    
        r8.getClass();
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0084, code lost:
    
        return r8;
     */
    @Override // defpackage.ffhp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.Object r8) {
        /*
            r7 = this;
            ffhh r0 = defpackage.ffhh.a
            int r1 = r7.a
            r2 = 1
            defpackage.ffci.b(r8)
            if (r1 == 0) goto Ld
            if (r1 == r2) goto L6e
            goto L81
        Ld:
            cagm r8 = r7.b
            ffbr r8 = r8.b
            java.lang.Object r8 = r8.b()
            cagi r8 = (defpackage.cagi) r8
            java.util.Set r1 = r7.c
            cagq r3 = defpackage.cagq.a
            eyfq r3 = r3.createBuilder()
            cagn r3 = (defpackage.cagn) r3
            r3.getClass()
            MessageType extends eyfy<MessageType, BuilderType> r4 = r3.instance
            cagq r4 = (defpackage.cagq) r4
            eygr r4 = r4.b
            java.util.List r4 = j$.util.DesugarCollections.unmodifiableList(r4)
            r4.getClass()
            r3.copyOnWrite()
            MessageType extends eyfy<MessageType, BuilderType> r4 = r3.instance
            cagq r4 = (defpackage.cagq) r4
            eygr r5 = r4.b
            boolean r6 = r5.c()
            if (r6 != 0) goto L46
            eygr r5 = defpackage.eyfy.mutableCopy(r5)
            r4.b = r5
        L46:
            eygr r4 = r4.b
            defpackage.eydl.addAll(r1, r4)
            eyfy r1 = r3.build()
            r1.getClass()
            ffbr r8 = r8.a
            cagq r1 = (defpackage.cagq) r1
            java.lang.Object r8 = r8.b()
            cevh r8 = (defpackage.cevh) r8
            java.lang.String r3 = "encrypted_message_delete"
            ceyr r1 = defpackage.ceyr.g(r3, r1)
            elfl r8 = r8.b(r1)
            r7.a = r2
            java.lang.Object r8 = defpackage.fgfz.c(r8, r7)
            if (r8 == r0) goto L85
        L6e:
            cevg r8 = (defpackage.cevg) r8
            elfl r8 = r8.b()
            r8.getClass()
            r1 = 2
            r7.a = r1
            java.lang.Object r8 = defpackage.fgfz.c(r8, r7)
            if (r8 != r0) goto L81
            goto L85
        L81:
            r8.getClass()
            return r8
        L85:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cagl.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new cagl(this.b, this.c, ffguVar);
    }
}
