package defpackage;

import com.google.android.apps.messaging.shared.photos.client.MediaUploadStates;
import java.util.List;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes8.dex */
final class cjhm extends ffhv implements ffjm {
    int a;
    final /* synthetic */ cjho b;
    final /* synthetic */ eisx c;
    final /* synthetic */ List d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cjhm(cjho cjhoVar, eisx eisxVar, List list, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = cjhoVar;
        this.c = eisxVar;
        this.d = list;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cjhm) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i == 0) {
            cjho cjhoVar = this.b;
            eisx eisxVar = this.c;
            List list = this.d;
            this.a = 1;
            obj = cjhoVar.f(eisxVar, list, this);
            if (obj == ffhhVar) {
                return ffhhVar;
            }
        }
        return new MediaUploadStates((Map) obj);
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new cjhm(this.b, this.c, this.d, ffguVar);
    }
}
