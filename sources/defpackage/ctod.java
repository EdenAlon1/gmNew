package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ctod extends ffhv implements ffjm {
    int a;
    final /* synthetic */ ctof b;
    final /* synthetic */ List c;
    final /* synthetic */ MessageCoreData d;
    private /* synthetic */ Object e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ctod(ffgu ffguVar, ctof ctofVar, List list, MessageCoreData messageCoreData) {
        super(2, ffguVar);
        this.b = ctofVar;
        this.c = list;
        this.d = messageCoreData;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((ctod) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0054 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x00b0 A[Catch: Exception -> 0x0016, TRY_LEAVE, TryCatch #2 {Exception -> 0x0016, blocks: (B:6:0x000e, B:7:0x0050, B:30:0x0098, B:9:0x00b0, B:34:0x0012, B:35:0x0038, B:40:0x0021), top: B:2:0x0006 }] */
    @Override // defpackage.ffhp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.Object r12) {
        /*
            Method dump skipped, instructions count: 215
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ctod.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        ctod ctodVar = new ctod(ffguVar, this.b, this.c, this.d);
        ctodVar.e = obj;
        return ctodVar;
    }
}
