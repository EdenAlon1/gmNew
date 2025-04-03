package defpackage;

import android.content.Context;
import android.net.Uri;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.shared.api.messaging.Conversation;
import j$.util.Optional;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aast {
    public final czxo a;
    public final Context b;
    public final ffbr c;
    public final abct d;
    public final ffbr e;
    public final ffbr f;
    public final Optional g;
    public final ffxx h;
    private final ajjc i;
    private final aigz j;

    public aast(czxo czxoVar, Context context, ajjc ajjcVar, ffbr ffbrVar, abct abctVar, ffbr ffbrVar2, ffbr ffbrVar3, ffbr ffbrVar4, ffxx ffxxVar, ffxx ffxxVar2, ffsk ffskVar, Optional optional, Conversation conversation, ffbr ffbrVar5, ffxx ffxxVar3, aigz aigzVar) {
        czxoVar.getClass();
        context.getClass();
        ajjcVar.getClass();
        ffbrVar.getClass();
        ffbrVar4.getClass();
        ffxxVar.getClass();
        ffxxVar2.getClass();
        ffskVar.getClass();
        conversation.getClass();
        ffbrVar5.getClass();
        aigzVar.getClass();
        this.a = czxoVar;
        this.b = context;
        this.i = ajjcVar;
        this.c = ffbrVar;
        this.d = abctVar;
        this.e = ffbrVar2;
        this.f = ffbrVar3;
        this.g = optional;
        this.h = ffxxVar3;
        this.j = aigzVar;
        ffca.a(new ffix() { // from class: aasg
            @Override // defpackage.ffix
            public final Object invoke() {
                return (tac) aast.this.f.b();
            }
        });
    }

    public final dnhh a(int i, dmzz dmzzVar) {
        String string = this.b.getString(i);
        string.getClass();
        return new dnhh(string, dmzzVar, (List) null, false, 28);
    }

    public final void b(aasf aasfVar) {
        if (((auux) this.c.b()).a()) {
            ((alye) this.e.b()).I(aasfVar.a, aasfVar.b.a());
        }
    }

    public final void c(aasf aasfVar, final aqux aquxVar) {
        int a = aasfVar.b.a() - 1;
        if (a == 2) {
            this.i.d(true, new ffji() { // from class: aash
                @Override // defpackage.ffji
                public final Object invoke(Object obj) {
                    ajiy ajiyVar = (ajiy) obj;
                    ajiyVar.getClass();
                    aast aastVar = aast.this;
                    String string = aastVar.b.getString(R.string.satellite_messaging_toolstone_link);
                    string.getClass();
                    dnhh[] dnhhVarArr = new dnhh[3];
                    dnhhVarArr[0] = aastVar.a(R.string.sky_view_list_item, dmzz.dU);
                    aqux aquxVar2 = aquxVar;
                    int i = R.string.message_time_list_item;
                    if (aquxVar2 != null && aquxVar2.s()) {
                        i = R.string.message_time_list_item_media_allowed;
                    }
                    dnhhVarArr[1] = aastVar.a(i, dmzz.cr);
                    dnhhVarArr[2] = aastVar.a(R.string.message_recipient_list_item, dmzz.br);
                    List g = ffdx.g(dnhhVarArr);
                    String string2 = aastVar.b.getString(R.string.got_it_button);
                    string2.getClass();
                    doas doasVar = new doas(string2, new aasr(ajiyVar));
                    String string3 = aastVar.b.getString(R.string.more_about_satellite_button);
                    string3.getClass();
                    return new dmvi(string, g, null, null, doasVar, new doas(string3, new aass(aastVar.d)), null, 76);
                }
            });
            if (((auux) this.c.b()).a()) {
                ((alye) this.e.b()).Q(3);
                return;
            }
            return;
        }
        if (a != 3) {
            if (a != 4) {
                return;
            }
            this.j.h(new aile(Uri.parse("https://support.google.com/families?p=gff_help_find")));
        } else if (((auux) this.c.b()).a()) {
            ((alye) this.e.b()).Q(4);
        }
    }
}
