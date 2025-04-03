package defpackage;

import android.os.ParcelFileDescriptor;
import java.util.UUID;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class akec extends ffhv implements ffjm {
    int a;
    final /* synthetic */ akee b;
    final /* synthetic */ ParcelFileDescriptor c;
    final /* synthetic */ dfix d;
    final /* synthetic */ eyee e;
    private /* synthetic */ Object f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public akec(ffgu ffguVar, akee akeeVar, ParcelFileDescriptor parcelFileDescriptor, dfix dfixVar, eyee eyeeVar) {
        super(2, ffguVar);
        this.b = akeeVar;
        this.c = parcelFileDescriptor;
        this.d = dfixVar;
        this.e = eyeeVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((akec) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i != 0) {
            return obj;
        }
        akee akeeVar = this.b;
        ParcelFileDescriptor parcelFileDescriptor = this.c;
        parcelFileDescriptor.getClass();
        dfix dfixVar = this.d;
        UUID b = cqjf.b(this.e);
        this.a = 1;
        Object e = akeeVar.e(parcelFileDescriptor, dfixVar, b, this);
        return e == ffhhVar ? ffhhVar : e;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        akec akecVar = new akec(ffguVar, this.b, this.c, this.d, this.e);
        akecVar.f = obj;
        return akecVar;
    }
}
