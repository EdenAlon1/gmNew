package defpackage;

import com.google.android.apps.messaging.shared.datamodel.database.upgrade.CustomUpgradeSteps;
import com.google.android.apps.messaging.shared.datamodel.database.upgrade.OnDeviceDatabaseUpgradeHandler;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class becd {
    private final ffbr a;
    private final ffbr b;
    private final ffbr c;
    private final ffbr d;
    private final ffbr e;
    private final ffbr f;
    private final ffbr g;

    public becd(ffbr ffbrVar, ffbr ffbrVar2, ffbr ffbrVar3, ffbr ffbrVar4, ffbr ffbrVar5, ffbr ffbrVar6, ffbr ffbrVar7) {
        ffbrVar.getClass();
        this.a = ffbrVar;
        ffbrVar2.getClass();
        this.b = ffbrVar2;
        this.c = ffbrVar3;
        ffbrVar4.getClass();
        this.d = ffbrVar4;
        this.e = ffbrVar5;
        this.f = ffbrVar6;
        ffbrVar7.getClass();
        this.g = ffbrVar7;
    }

    public final /* synthetic */ bebb a(dtve dtveVar, dttz dttzVar, int i, int i2) {
        CustomUpgradeSteps customUpgradeSteps = (CustomUpgradeSteps) this.a.b();
        customUpgradeSteps.getClass();
        Map map = (Map) this.c.b();
        map.getClass();
        azye azyeVar = (azye) this.e.b();
        azyeVar.getClass();
        cqdi cqdiVar = (cqdi) this.f.b();
        cqdiVar.getClass();
        Map map2 = (Map) ((fbbb) this.g).a;
        dtveVar.getClass();
        dttzVar.getClass();
        return new OnDeviceDatabaseUpgradeHandler(customUpgradeSteps, this.b, map, this.d, azyeVar, cqdiVar, map2, dtveVar, dttzVar, i, i2);
    }
}
