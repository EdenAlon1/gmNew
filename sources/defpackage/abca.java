package defpackage;

import android.content.Context;
import com.google.android.apps.messaging.R;
import j$.util.Optional;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class abca {
    public final Context a;
    public final abcf b;
    public final abbs c;
    public final Map d;
    private final abbu e;
    private final abbv f;
    private final ffbr g;
    private final ffbr h;
    private final ffbr i;

    public abca(Context context, abcf abcfVar, abbs abbsVar, abbu abbuVar, abbv abbvVar, Map map, ffbr ffbrVar, ffbr ffbrVar2, ffbr ffbrVar3) {
        context.getClass();
        abcfVar.getClass();
        abbuVar.getClass();
        abbvVar.getClass();
        ffbrVar3.getClass();
        this.a = context;
        this.b = abcfVar;
        this.c = abbsVar;
        this.e = abbuVar;
        this.f = abbvVar;
        this.d = map;
        this.g = ffbrVar;
        this.h = ffbrVar2;
        this.i = ffbrVar3;
    }

    public final String a(String str, boolean z) {
        String string = this.a.getString(true != z ? R.string.reaction_selection_content_description : R.string.selected_reaction_selection_content_description, str);
        string.getClass();
        return string;
    }

    public final void b(apyv apyvVar, alxr alxrVar, apza apzaVar, cmrx cmrxVar, ffix ffixVar) {
        apyv apyvVar2 = apzaVar != null ? apzaVar.a : null;
        cmrm cmrmVar = apyvVar2 == null ? cmrm.ADD_REACTION : ffkj.e(apyvVar2, apyvVar) ? cmrm.REMOVE_REACTION : cmrm.REPLACE_REACTION;
        if (cmrmVar != cmrm.REMOVE_REACTION && zro.b(alxrVar) && ((Boolean) ((cfup) ctjd.ak.get()).e()).booleanValue()) {
            boolean e = ffkj.e(apyvVar, abbc.c);
            boolean e2 = ffkj.e(apyvVar, abbc.d);
            if (e2 && ((Boolean) ctjd.ao.e()).booleanValue()) {
                ((aigz) this.h.b()).h(new aiiy(null));
            } else {
                if (!e) {
                    if (e2) {
                        e2 = true;
                    }
                }
                ((ddwn) this.g.b()).a(R.string.feedback_confirmation, true);
            }
            if (((Optional) this.i.b()).isPresent()) {
                ajfs ajfsVar = (ajfs) ((Optional) this.i.b()).get();
                if (e) {
                    ajfsVar.e();
                } else if (e2) {
                    ajfsVar.d();
                }
            }
        }
        this.f.d(cmrmVar, cmrxVar, alxrVar.p());
        this.e.a(apyvVar, alxrVar.b(), cmrxVar, cmrmVar, apzaVar != null ? apzaVar.b : null);
        ffixVar.invoke();
    }
}
