package defpackage;

import android.content.Context;
import com.google.android.ims.provisioning.config.InstantMessageConfiguration;
import com.google.android.ims.rcsservice.filetransfer.FileTransferInfo;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class diru {
    public static final diyy a = diyv.b("read_http_request_executor_factory_from_provider");
    public final dirz b;
    public final dijz c;
    public final dirw d;
    private final dirm e;
    private final diuj f;
    private final disq g;
    private final diss h;
    private final diss i;
    private final ffbr j;
    private final ffbr k;

    public diru(dirz dirzVar, dirm dirmVar, diuj diujVar, dijz dijzVar, disq disqVar, diss dissVar, diss dissVar2, ffbr ffbrVar, ffbr ffbrVar2, dirw dirwVar) {
        this.b = dirzVar;
        this.e = dirmVar;
        this.f = diujVar;
        this.c = dijzVar;
        this.d = dirwVar;
        this.h = dissVar;
        this.i = dissVar2;
        this.j = ffbrVar;
        this.k = ffbrVar2;
        this.g = disqVar;
    }

    private final diss e() {
        return ((Boolean) a.a()).booleanValue() ? (diss) this.j.b() : this.h;
    }

    public final dirl a(long j, String str, InstantMessageConfiguration instantMessageConfiguration, diuc diucVar, String str2, Optional optional, int i) {
        dijy dijyVar = new dijy(this.c, str, 2);
        disp a2 = this.g.a(dijyVar, e().a(instantMessageConfiguration, dijyVar));
        dirm dirmVar = this.e;
        ffbr ffbrVar = dirmVar.a;
        String a3 = this.d.a();
        Context context = (Context) ffbrVar.b();
        dips dipsVar = (dips) dirmVar.b.b();
        djqt djqtVar = (djqt) dirmVar.c.b();
        str.getClass();
        instantMessageConfiguration.getClass();
        str2.getClass();
        optional.getClass();
        return new dirl(context, dipsVar, djqtVar, dirmVar.e, a2, j, str, instantMessageConfiguration, diucVar, str2, optional, i, dijyVar, a3);
    }

    public final diry b(long j, String str, String str2, FileTransferInfo fileTransferInfo, InstantMessageConfiguration instantMessageConfiguration, diuc diucVar) {
        dijy d = this.c.d(false, str);
        return this.b.a(j, str, str2, fileTransferInfo, instantMessageConfiguration, diucVar, false, d, c().a(instantMessageConfiguration, d), this.d.b());
    }

    public final diss c() {
        return ((Boolean) a.a()).booleanValue() ? (diss) this.k.b() : this.i;
    }

    public final diui d(long j, String str, InstantMessageConfiguration instantMessageConfiguration, diuc diucVar, String str2, int i) {
        dijy dijyVar = new dijy(this.c, str, 6);
        disp a2 = this.g.a(dijyVar, e().a(instantMessageConfiguration, dijyVar));
        diuj diujVar = this.f;
        ffbr ffbrVar = diujVar.a;
        String a3 = this.d.a();
        Context context = (Context) ffbrVar.b();
        str.getClass();
        instantMessageConfiguration.getClass();
        dips dipsVar = (dips) diujVar.b.b();
        str2.getClass();
        return new diui(context, a2, j, str, instantMessageConfiguration, diucVar, dipsVar, str2, i, dijyVar, a3, diujVar.d);
    }
}
