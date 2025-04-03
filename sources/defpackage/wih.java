package defpackage;

import android.content.SharedPreferences;
import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class wih extends ffhv implements ffjm {
    int a;
    final /* synthetic */ wii b;
    private /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wih(wii wiiVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = wiiVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((wih) c((ffxe) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i == 0) {
            final ffxe ffxeVar = (ffxe) this.c;
            final String string = this.b.a.getResources().getString(R.string.mc_enabled_pref_key);
            string.getClass();
            final wii wiiVar = this.b;
            wiiVar.l = new elbe(wiiVar.k, new SharedPreferences.OnSharedPreferenceChangeListener() { // from class: wid
                @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
                public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
                    if (ffkj.e(str, string)) {
                        ffxe ffxeVar2 = ffxeVar;
                        wii wiiVar2 = wiiVar;
                        axol.k(wiiVar2.b, null, new wif(ffxeVar2, wiiVar2, null), 3);
                    }
                }
            }, "MagicComposeLauncher");
            ctyx ctyxVar = (ctyx) wiiVar.i.b();
            SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener = this.b.l;
            if (onSharedPreferenceChangeListener == null) {
                ffkj.c("prefsListener");
                onSharedPreferenceChangeListener = null;
            }
            ctyxVar.m(onSharedPreferenceChangeListener);
            wii wiiVar2 = this.b;
            axol.k(wiiVar2.b, null, new wig(ffxeVar, wiiVar2, null), 3);
            final wii wiiVar3 = this.b;
            ffix ffixVar = new ffix() { // from class: wie
                @Override // defpackage.ffix
                public final Object invoke() {
                    wii wiiVar4 = wii.this;
                    ctyx ctyxVar2 = (ctyx) wiiVar4.i.b();
                    SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener2 = wiiVar4.l;
                    if (onSharedPreferenceChangeListener2 == null) {
                        ffkj.c("prefsListener");
                        onSharedPreferenceChangeListener2 = null;
                    }
                    ctyxVar2.o(onSharedPreferenceChangeListener2);
                    return ffcu.a;
                }
            };
            this.a = 1;
            if (ffxd.b(ffxeVar, ffixVar, this) == ffhhVar) {
                return ffhhVar;
            }
        }
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        wih wihVar = new wih(this.b, ffguVar);
        wihVar.c = obj;
        return wihVar;
    }
}
