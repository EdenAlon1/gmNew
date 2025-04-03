package defpackage;

import android.content.Context;
import android.net.Uri;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.shared.api.messaging.recipient.ResolvedRecipient;
import j$.time.Instant;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class apxy implements apyd, apye {
    private final Context a;
    private final enhk b;
    private final cmrf c;
    private final engw d;
    private final aoug e;

    public apxy(Context context, aoug aougVar, enhk enhkVar, cmrf cmrfVar, cmrl cmrlVar) {
        apyv apzgVar;
        fjay fjayVar;
        apxz apxzVar;
        String y;
        String string;
        this.a = context;
        this.e = aougVar;
        this.b = enhkVar;
        this.c = cmrfVar;
        eygr<cmro> eygrVar = cmrfVar.b;
        eygrVar.getClass();
        int i = 10;
        ArrayList arrayList = new ArrayList(ffdx.n(eygrVar, 10));
        for (cmro cmroVar : eygrVar) {
            cmrl cmrlVar2 = cmroVar.c;
            cmrv b = cmrv.b((cmrlVar2 == null ? cmrl.a : cmrlVar2).e);
            if ((b == null ? cmrv.UNRECOGNIZED : b).ordinal() != 13) {
                cmrl cmrlVar3 = cmroVar.c;
                String str = (cmrlVar3 == null ? cmrl.a : cmrlVar3).d;
                str.getClass();
                apzgVar = new apxx(str);
            } else if (((Boolean) ctjd.aj.e()).booleanValue()) {
                cmrl cmrlVar4 = cmroVar.c;
                cmrlVar4 = cmrlVar4 == null ? cmrl.a : cmrlVar4;
                String str2 = (cmrlVar4.b == 101 ? (draj) cmrlVar4.c : draj.a).c;
                str2.getClass();
                cmrl cmrlVar5 = cmroVar.c;
                cmrlVar5 = cmrlVar5 == null ? cmrl.a : cmrlVar5;
                droo drooVar = (cmrlVar5.b == 101 ? (draj) cmrlVar5.c : draj.a).g;
                doyi doyiVar = (drooVar == null ? droo.a : drooVar).f;
                String str3 = (doyiVar == null ? doyi.a : doyiVar).f;
                str3.getClass();
                apzgVar = new apzh(str2, str3);
            } else {
                cmrl cmrlVar6 = cmroVar.c;
                cmrlVar6 = cmrlVar6 == null ? cmrl.a : cmrlVar6;
                draj drajVar = cmrlVar6.b == 101 ? (draj) cmrlVar6.c : draj.a;
                drajVar.getClass();
                apzgVar = new apzg(dran.i(drajVar));
            }
            int size = cmroVar.d.size();
            cmrl cmrlVar7 = cmroVar.c;
            boolean e = ffkj.e(cmrlVar7 == null ? cmrl.a : cmrlVar7, cmrlVar);
            eygr<cmrs> eygrVar2 = cmroVar.d;
            eygrVar2.getClass();
            ArrayList arrayList2 = new ArrayList(ffdx.n(eygrVar2, i));
            for (cmrs cmrsVar : eygrVar2) {
                fjay fjayVar2 = cmrsVar.e;
                String str4 = null;
                str4 = null;
                str4 = null;
                if (ffkj.e(fjayVar2 == null ? fjay.a : fjayVar2, fjay.a)) {
                    fjayVar = null;
                } else {
                    fjay fjayVar3 = cmrsVar.e;
                    fjayVar = fjayVar3 == null ? fjay.a : fjayVar3;
                }
                cmri cmriVar = cmrsVar.c;
                if ((cmriVar == null ? cmri.a : cmriVar).c) {
                    enhk enhkVar2 = this.b;
                    cmri cmriVar2 = cmrsVar.c;
                    aqux aquxVar = (aqux) enhkVar2.get((cmriVar2 == null ? cmri.a : cmriVar2).b);
                    if (aquxVar == null) {
                        Iterator it = this.b.entrySet().iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                aquxVar = null;
                                break;
                            }
                            aqux aquxVar2 = (aqux) ((Map.Entry) it.next()).getValue();
                            if (aquxVar2 != null) {
                                aquxVar = aquxVar2;
                                break;
                            }
                        }
                        if (aquxVar == null) {
                            throw new NoSuchElementException("No element of the map was transformed to a non-null value.");
                        }
                    }
                    aqux aquxVar3 = aquxVar;
                    if (ersy.a("bugle.show_sim_name_for_self_reaction", "bugle")) {
                        string = aquxVar3.o();
                    } else {
                        string = this.a.getString(R.string.you_name);
                        string.getClass();
                    }
                    String str5 = string;
                    Uri c = aquxVar3.c();
                    boolean z = cmrsVar.d;
                    String str6 = cmrsVar.f;
                    str6 = str6.length() == 0 ? null : str6;
                    apxzVar = new apxz(str5, c, z, aquxVar3, fjayVar, null, str6 != null ? bdhg.a(str6) : null, 32);
                } else {
                    aoug aougVar2 = this.e;
                    cmri cmriVar3 = cmrsVar.c;
                    ResolvedRecipient b2 = aougVar2.b((cmriVar3 == null ? cmri.a : cmriVar3).b);
                    String str7 = (b2 == null || (str7 = b2.x(true)) == null) ? "" : str7;
                    Uri uri = (b2 == null || (uri = b2.b()) == null) ? Uri.EMPTY : uri;
                    uri.getClass();
                    boolean z2 = cmrsVar.d;
                    if (ersy.a("bugle.enable_profile_name_in_reactions", "bugle") && b2 != null && (y = b2.y()) != null) {
                        str4 = cjze.a(y);
                    }
                    apxzVar = new apxz(str7, uri, z2, null, fjayVar, str4, null, 72);
                }
                arrayList2.add(apxzVar);
            }
            arrayList.add(new apya(apzgVar, size, e, engq.a(arrayList2)));
            i = 10;
        }
        this.d = engq.a(arrayList);
    }

    @Override // defpackage.apyd
    public final /* synthetic */ apyv a() {
        return apyc.a(this);
    }

    @Override // defpackage.apyd
    public final /* synthetic */ apyv b(aqux aquxVar) {
        return apyc.b(this, aquxVar);
    }

    @Override // defpackage.apyd
    public final /* synthetic */ apza c(aqux aquxVar) {
        return apyc.c(this, aquxVar);
    }

    @Override // defpackage.apyd
    public final engw d() {
        return this.d;
    }

    @Override // defpackage.apye
    public final Instant e() {
        Instant ofEpochMilli = Instant.ofEpochMilli(this.c.c);
        ofEpochMilli.getClass();
        return ofEpochMilli;
    }
}
