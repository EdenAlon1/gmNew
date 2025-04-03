package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class hfi extends ffkk implements ffix {
    final /* synthetic */ hfm a;
    final /* synthetic */ hle b;
    final /* synthetic */ hjq c;
    final /* synthetic */ hhn d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hfi(hfm hfmVar, hle hleVar, hjq hjqVar, hhn hhnVar) {
        super(0);
        this.a = hfmVar;
        this.b = hleVar;
        this.c = hjqVar;
        this.d = hhnVar;
    }

    @Override // defpackage.ffix
    public final /* bridge */ /* synthetic */ Object invoke() {
        hfm hfmVar = this.a;
        hlf hlfVar = hfmVar.x;
        hle hleVar = this.b;
        hjq hjqVar = this.c;
        hhn hhnVar = this.d;
        hle hleVar2 = hlfVar.a;
        try {
            hlfVar.a = hleVar;
            hjq hjqVar2 = hfmVar.s;
            int[] iArr = hfmVar.g;
            cnw cnwVar = hfmVar.k;
            hfmVar.g = null;
            hfmVar.k = null;
            try {
                hfmVar.s = hjqVar;
                boolean z = hlfVar.d;
                try {
                    hlfVar.d = false;
                    hfm.al(hfmVar, hhnVar.a, hhnVar.h, hhnVar.b);
                    hlfVar.a = hleVar2;
                    return ffcu.a;
                } finally {
                    hlfVar.d = z;
                }
            } finally {
                hfmVar.s = hjqVar2;
                hfmVar.g = iArr;
                hfmVar.k = cnwVar;
            }
        } catch (Throwable th) {
            hlfVar.a = hleVar2;
            throw th;
        }
    }
}
