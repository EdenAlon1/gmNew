package defpackage;

import android.location.Location;
import j$.time.Instant;

/* compiled from: PG */
/* loaded from: classes8.dex */
final class cjft extends ffhv implements ffjm {
    /* synthetic */ Object a;
    final /* synthetic */ Location b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cjft(Location location, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = location;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cjft) c((cjen) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffci.b(obj);
        cjek cjekVar = (cjek) ((cjen) this.a).toBuilder();
        cjekVar.getClass();
        cjeg cjegVar = (cjeg) cjeh.a.createBuilder();
        cjegVar.getClass();
        Location location = this.b;
        double latitude = location.getLatitude();
        cjegVar.copyOnWrite();
        cjeh cjehVar = (cjeh) cjegVar.instance;
        cjehVar.b |= 1;
        cjehVar.c = latitude;
        double longitude = location.getLongitude();
        cjegVar.copyOnWrite();
        cjeh cjehVar2 = (cjeh) cjegVar.instance;
        cjehVar2.b |= 2;
        cjehVar2.d = longitude;
        float accuracy = location.getAccuracy();
        cjegVar.copyOnWrite();
        cjeh cjehVar3 = (cjeh) cjegVar.instance;
        cjehVar3.b |= 4;
        cjehVar3.e = accuracy;
        Instant ofEpochMilli = Instant.ofEpochMilli(location.getTime());
        ofEpochMilli.getClass();
        eyja b = eykn.b(ofEpochMilli);
        cjegVar.copyOnWrite();
        cjeh cjehVar4 = (cjeh) cjegVar.instance;
        cjehVar4.f = b;
        cjehVar4.b |= 8;
        eyfy build = cjegVar.build();
        build.getClass();
        cjekVar.copyOnWrite();
        cjen cjenVar = (cjen) cjekVar.instance;
        cjenVar.f = (cjeh) build;
        cjenVar.b |= 4;
        return cjfx.a(cjekVar);
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        cjft cjftVar = new cjft(this.b, ffguVar);
        cjftVar.a = obj;
        return cjftVar;
    }
}
