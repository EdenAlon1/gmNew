package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.net.Uri;
import android.text.TextUtils;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class vit {
    public final errm a;
    private final Resources b;
    private final azze c;

    public vit(Context context, errm errmVar, azze azzeVar) {
        this.b = context.getResources();
        this.a = errmVar;
        this.c = azzeVar;
    }

    public final engw a(cmrf cmrfVar, bctw bctwVar, ParticipantsTable.BindData bindData) {
        engr engrVar = new engr();
        for (cmro cmroVar : cmrfVar.b) {
            for (cmrs cmrsVar : cmroVar.d) {
                if ((cmrsVar.b & 1) != 0) {
                    cmri cmriVar = cmrsVar.c;
                    if (cmriVar == null) {
                        cmriVar = cmri.a;
                    }
                    if (cmriVar.c) {
                        Resources resources = this.b;
                        azze azzeVar = this.c;
                        String string = resources.getString(R.string.self_participant_reaction_name);
                        Uri a = azzeVar.a(bindData);
                        cmrl cmrlVar = cmroVar.c;
                        if (cmrlVar == null) {
                            cmrlVar = cmrl.a;
                        }
                        engrVar.h(vji.a(string, a, cmrlVar, cmrsVar.d).a);
                    } else {
                        ParticipantsTable.BindData b = bctwVar.b(cmriVar.b);
                        if (b == null) {
                            String str = cmriVar.b;
                            ekzz f = eleg.f("ReactionSummaryItemDataConverter#getParticipantDataFromDatabase");
                            try {
                                ParticipantsTable.BindData b2 = ParticipantsTable.b(str);
                                f.close();
                                if (b2 != null) {
                                    b = b2;
                                }
                            } catch (Throwable th) {
                                try {
                                    f.close();
                                } catch (Throwable th2) {
                                    th.addSuppressed(th2);
                                }
                                throw th;
                            }
                        }
                        String R = b.R();
                        if (TextUtils.isEmpty(R)) {
                            R = b.P();
                        }
                        if (!TextUtils.isEmpty(R)) {
                            Uri a2 = this.c.a(b);
                            cmrl cmrlVar2 = cmroVar.c;
                            if (cmrlVar2 == null) {
                                cmrlVar2 = cmrl.a;
                            }
                            engrVar.h(vji.a(R, a2, cmrlVar2, cmrsVar.d).a);
                        }
                    }
                }
            }
        }
        return engrVar.g();
    }
}
