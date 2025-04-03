package defpackage;

import android.content.Context;
import android.os.Build;
import android.os.LocaleList;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class emdc implements emcz {
    private final Context a;
    private final ffbr b;

    public emdc(Context context, ffbr ffbrVar) {
        this.a = context;
        this.b = ffbrVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final eydq c(fams famsVar) {
        if (famsVar.b.size() != 1) {
            return null;
        }
        famh famhVar = (famh) famsVar.b.get(0);
        if (famhVar.b == 3) {
            return (eydq) famhVar.c;
        }
        return null;
    }

    public final famj a() {
        famj famjVar = (famj) this.b.b();
        fdxi fdxiVar = evcy.a;
        evby evbyVar = new evby();
        evbyVar.b(new enpx("https://www.googleapis.com/auth/mdi.aratea"));
        return (famj) ((famj) ((famj) famjVar.m(fdxiVar, new evce(evbyVar.c()))).m(evgq.b, 8704)).j(10L, TimeUnit.SECONDS);
    }

    public final famq b(famf famfVar, int i) {
        LocaleList locales;
        Locale locale;
        famp fampVar = (famp) famq.a.createBuilder();
        fampVar.copyOnWrite();
        famq famqVar = (famq) fampVar.instance;
        famfVar.getClass();
        eygr eygrVar = famqVar.e;
        if (!eygrVar.c()) {
            famqVar.e = eyfy.mutableCopy(eygrVar);
        }
        famqVar.e.add(famfVar);
        faml famlVar = (faml) famn.a.createBuilder();
        famlVar.copyOnWrite();
        famn famnVar = (famn) famlVar.instance;
        famnVar.c = 1;
        famnVar.b |= 1;
        famc famcVar = (famc) famd.a.createBuilder();
        String str = Build.MODEL;
        famcVar.copyOnWrite();
        famd famdVar = (famd) famcVar.instance;
        str.getClass();
        famdVar.b |= 8;
        famdVar.c = str;
        locales = this.a.getResources().getConfiguration().getLocales();
        locale = locales.get(0);
        String lowerCase = locale.getLanguage().toLowerCase(Locale.ROOT);
        famcVar.copyOnWrite();
        famd famdVar2 = (famd) famcVar.instance;
        lowerCase.getClass();
        famdVar2.b |= 16;
        famdVar2.d = lowerCase;
        famlVar.copyOnWrite();
        famn famnVar2 = (famn) famlVar.instance;
        famd famdVar3 = (famd) famcVar.build();
        famdVar3.getClass();
        famnVar2.d = famdVar3;
        famnVar2.b |= 2;
        famn famnVar3 = (famn) famlVar.build();
        fampVar.copyOnWrite();
        famq famqVar2 = (famq) fampVar.instance;
        famnVar3.getClass();
        famqVar2.d = famnVar3;
        famqVar2.b |= 2;
        fampVar.copyOnWrite();
        famq famqVar3 = (famq) fampVar.instance;
        famqVar3.c = i - 1;
        famqVar3.b |= 1;
        return (famq) fampVar.build();
    }
}
