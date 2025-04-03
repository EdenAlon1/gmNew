package defpackage;

import android.util.Log;
import io.grpc.Status;
import io.grpc.StatusException;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class efuh extends ffhv implements ffjm {
    int a;
    final /* synthetic */ efuj b;
    final /* synthetic */ ffjm c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public efuh(efuj efujVar, ffjm ffjmVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = efujVar;
        this.c = ffjmVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((efuh) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        try {
        } catch (StatusException e) {
            if (e.a.getCode() != Status.Code.UNAUTHENTICATED) {
                throw e;
            }
            if (Log.isLoggable("ProfileCommon", 4)) {
                Log.i("ProfileCommon", "Refreshing expired auth token", e);
            }
            efuj efujVar = this.b;
            ffjm ffjmVar = this.c;
            this.a = 2;
            Object a = efujVar.a(ffjmVar, this);
            if (a != ffhhVar) {
                return a;
            }
        }
        if (i != 0) {
            if (i != 1) {
                ffci.b(obj);
                return obj;
            }
            ffci.b(obj);
            return obj;
        }
        ffci.b(obj);
        efuj efujVar2 = this.b;
        ffjm ffjmVar2 = this.c;
        this.a = 1;
        Object a2 = efujVar2.a(ffjmVar2, this);
        return a2 == ffhhVar ? ffhhVar : a2;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new efuh(this.b, this.c, ffguVar);
    }
}
