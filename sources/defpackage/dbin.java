package defpackage;

import android.app.Activity;
import android.app.ActivityOptions;
import android.app.PendingIntent;
import android.os.Bundle;
import com.google.android.gms.common.api.Status;
import java.security.GeneralSecurityException;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class dbin extends ffhv implements ffjm {
    Object a;
    int b;
    final /* synthetic */ hho c;
    final /* synthetic */ dbip d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dbin(hho hhoVar, dbip dbipVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.c = hhoVar;
        this.d = dbipVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((dbin) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r0v12, types: [hho] */
    /* JADX WARN: Type inference failed for: r0v14 */
    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ActivityOptions pendingIntentBackgroundActivityStartMode;
        Object obj2;
        ?? r0;
        ffhh ffhhVar = ffhh.a;
        int i = this.b;
        Bundle bundle = null;
        try {
        } catch (dfrj e) {
            dbip.a.s("getKeyMaterial failed. Trying to resolving it.", e);
            dbip dbipVar = this.d;
            Status status = e.a;
            if (status.c()) {
                if (dfyw.d()) {
                    pendingIntentBackgroundActivityStartMode = ActivityOptions.makeBasic().setPendingIntentBackgroundActivityStartMode(1);
                    bundle = pendingIntentBackgroundActivityStartMode.toBundle();
                }
                Activity activity = dbipVar.c;
                PendingIntent pendingIntent = status.h;
                dfwv.n(pendingIntent);
                activity.startIntentSenderForResult(pendingIntent.getIntentSender(), 1001, null, 0, 0, 0, bundle);
            }
            this.c.b("Resolved the key.");
        } catch (dfqu e2) {
            dbip.a.s("getKeyMaterial failed", e2);
            this.c.b("getKeyMaterial failed.\n\ne");
        } catch (GeneralSecurityException e3) {
            dbip.a.s("getKeyMaterial failed", e3);
            hho hhoVar = this.c;
            e3.toString();
            hhoVar.b("getKeyMaterial failed.\n\n ".concat(e3.toString()));
        }
        if (i == 0) {
            ffci.b(obj);
            hho hhoVar2 = this.c;
            dbfy dbfyVar = this.d.b;
            this.a = hhoVar2;
            this.b = 1;
            ffsk ffskVar = dbfyVar.d;
            ffhe ffheVar = ffhe.a;
            ffss b = ffra.b(ffskVar, ekxi.a(ffheVar), ffsm.a, new dbfp(null, dbfyVar));
            if (b == ffhhVar) {
                return ffhhVar;
            }
            obj2 = hhoVar2;
            obj = b;
        } else {
            if (i != 1) {
                Object obj3 = this.a;
                ffci.b(obj);
                r0 = obj3;
                r0.b(obj);
                return ffcu.a;
            }
            obj2 = this.a;
            ffci.b(obj);
        }
        this.a = obj2;
        this.b = 2;
        obj = ((ffss) obj).c(this);
        if (obj != ffhhVar) {
            r0 = obj2;
            r0.b(obj);
            return ffcu.a;
        }
        return ffhhVar;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new dbin(this.c, this.d, ffguVar);
    }
}
