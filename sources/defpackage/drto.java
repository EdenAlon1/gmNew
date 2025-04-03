package defpackage;

import java.util.Objects;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class drto extends ffhv implements ffjm {
    final /* synthetic */ drud a;
    private /* synthetic */ Object b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public drto(drud drudVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.a = drudVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((drto) c((edfo) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffci.b(obj);
        edfo edfoVar = (edfo) this.b;
        edek edekVar = (edek) edel.a.createBuilder();
        edekVar.getClass();
        edem.b(this.a.a, edekVar);
        edel a = edem.a(edekVar);
        febo feboVar = new febo();
        febs febsVar = edfj.d;
        if (febsVar == null) {
            synchronized (edfj.class) {
                febsVar = edfj.d;
                if (febsVar == null) {
                    febp a2 = febs.a();
                    a2.c = febr.SERVER_STREAMING;
                    a2.d = febs.c("com.google.android.libraries.photos.share.apiservice.proto.PhotosMediaShareService", "ObserveLinkSharedAlbumRequestStatus");
                    a2.b();
                    edel edelVar = edel.a;
                    eyfc eyfcVar = ffag.a;
                    a2.a = new ffae(edelVar);
                    a2.b = new ffae(edeu.a);
                    febsVar = a2.a();
                    edfj.d = febsVar;
                }
            }
        }
        fdxj fdxjVar = edfoVar.b;
        if (febsVar.a == febr.SERVER_STREAMING) {
            return fewj.a(edfoVar.a, febsVar, fdxjVar, feboVar, new fewb(a));
        }
        Objects.toString(febsVar);
        throw new IllegalArgumentException("Expected a server streaming RPC method, but got ".concat(febsVar.toString()));
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        drto drtoVar = new drto(this.a, ffguVar);
        drtoVar.b = obj;
        return drtoVar;
    }
}
