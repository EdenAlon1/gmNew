package defpackage;

import com.google.chat.smartmessaging.smartreply.android.LanguageDetectorJni;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class emlk {
    public static final enru a = enru.c("com/google/chat/smartmessaging/smartreply/android/SmartReplyLib");
    public final empv b;
    public final emkq c;
    public Optional d;
    public LanguageDetectorJni e;
    public final empf f;
    public final engw g;
    public final enip h;
    public final ctnj i;

    public emlk(empv empvVar, emkq emkqVar, Optional optional, LanguageDetectorJni languageDetectorJni, empf empfVar, engw engwVar, enip enipVar, ctnj ctnjVar) {
        if (empfVar == null) {
            throw new emlq("Cannot initialize SmartReplyLib without sensitivity classifier");
        }
        if (engwVar == null || engwVar.isEmpty()) {
            throw new emlq("Cannot initialize SmartReplyLib without suggestion providers");
        }
        this.b = empvVar;
        this.c = emkqVar;
        this.d = optional;
        this.e = languageDetectorJni;
        this.f = empfVar;
        this.g = engwVar;
        this.h = enipVar;
        this.i = ctnjVar;
    }

    public static empv a(emkd emkdVar) {
        return new empv(emkdVar, new empn());
    }
}
