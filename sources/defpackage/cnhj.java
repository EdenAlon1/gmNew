package defpackage;

import com.google.android.apps.messaging.shared.receiver.SpatulaSettingsBroadcastReceiver;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cnhj extends ffhv implements ffjm {
    int a;
    final /* synthetic */ SpatulaSettingsBroadcastReceiver b;
    final /* synthetic */ String c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cnhj(SpatulaSettingsBroadcastReceiver spatulaSettingsBroadcastReceiver, String str, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = spatulaSettingsBroadcastReceiver;
        this.c = str;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cnhj) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i == 0) {
            ffbr ffbrVar = this.b.b;
            if (ffbrVar == null) {
                ffkj.c("spatulaSettingsProxy");
                ffbrVar = null;
            }
            cutv cutvVar = (cutv) ffbrVar.b();
            String str = this.c;
            this.a = 1;
            if (cutvVar.b(str, this) == ffhhVar) {
                return ffhhVar;
            }
        }
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new cnhj(this.b, this.c, ffguVar);
    }
}
