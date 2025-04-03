package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fbp {
    public static final boolean a(jlm jlmVar) {
        int a = jlmVar.a();
        List list = jlmVar.a;
        if (list != null) {
            int size = list.size();
            for (int i = 0; i < size; i++) {
                jlk jlkVar = (jlk) list.get(i);
                if ((jlkVar.a instanceof jlw) && jlp.b(0, a, jlkVar.b, jlkVar.c)) {
                    return true;
                }
            }
        }
        return false;
    }
}
