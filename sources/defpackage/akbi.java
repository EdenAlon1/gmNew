package defpackage;

import java.io.File;
import java.util.UUID;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class akbi extends ffhv implements ffjm {
    int a;
    final /* synthetic */ akbo b;
    final /* synthetic */ UUID c;
    final /* synthetic */ File d;
    final /* synthetic */ sny e;
    private /* synthetic */ Object f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public akbi(ffgu ffguVar, akbo akboVar, UUID uuid, File file, sny snyVar) {
        super(2, ffguVar);
        this.b = akboVar;
        this.c = uuid;
        this.d = file;
        this.e = snyVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((akbi) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x00d0, code lost:
    
        if (r1.d(r4, r11, r10) == r0) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x00e9, code lost:
    
        if (r11.g(r1, r3, r10) == r0) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0086, code lost:
    
        if (r11.m.b(new defpackage.akaz(r11, r1, null), r10) != r0) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x009b, code lost:
    
        if (r11.z(r1) != r0) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x006a, code lost:
    
        if (r11 != r0) goto L14;
     */
    @Override // defpackage.ffhp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.Object r11) {
        /*
            Method dump skipped, instructions count: 240
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.akbi.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        akbi akbiVar = new akbi(ffguVar, this.b, this.c, this.d, this.e);
        akbiVar.f = obj;
        return akbiVar;
    }
}
