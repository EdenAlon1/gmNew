package defpackage;

import com.google.speech.grammar.pumpkin.ActionFrameManager;
import com.google.speech.grammar.pumpkin.Tagger;
import com.google.speech.grammar.pumpkin.UserValidators;
import java.util.logging.Logger;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class faqj {
    public ActionFrameManager c;
    public Tagger d;
    protected UserValidators e;

    static {
        Logger.getLogger(faqj.class.getName());
    }

    protected faqe a() {
        throw null;
    }

    public synchronized void b() {
        if (this.c == null) {
            this.c = new ActionFrameManager();
        }
        faqe a = a();
        if (this.d == null) {
            this.d = new Tagger(a);
        }
        if (this.e == null) {
            this.e = new UserValidators(a);
        }
    }
}
