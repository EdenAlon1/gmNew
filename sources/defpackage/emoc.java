package defpackage;

import com.google.speech.grammar.pumpkin.ActionFrame;
import com.google.speech.grammar.pumpkin.ActionFrameManager;
import com.google.speech.grammar.pumpkin.Tagger;
import j$.util.DesugarCollections;
import java.io.IOException;
import java.io.InputStream;
import java.util.Iterator;
import java.util.regex.Pattern;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class emoc implements emnk {
    private static final Pattern a = Pattern.compile("(\\s|^)(?<amount>\\$\\d*(\\.\\d*)?)(\\D|$)");
    private static final Pattern b = Pattern.compile("\\b(?<hour>[012]?\\d)[:\\s]?(?<minutes>[12345]\\d)?\\b");
    private final emoh c;
    private final Tagger d;
    private final ActionFrame e;
    private final emoa f;
    private final boolean g;

    public emoc(emoh emohVar, Tagger tagger, ActionFrame actionFrame, emoa emoaVar, boolean z) {
        this.c = emohVar;
        this.d = tagger;
        this.e = actionFrame;
        this.f = emoaVar;
        this.g = z;
    }

    public static emoc c(emoh emohVar, emmt emmtVar, boolean z) {
        emhv emhvVar;
        try {
            emob emobVar = new emob(emohVar, emmtVar);
            emobVar.b();
            Tagger tagger = emobVar.d;
            faqa faqaVar = emohVar.d;
            if (faqaVar == null) {
                faqaVar = faqa.a;
            }
            fapz fapzVar = (fapz) faqa.a.createBuilder();
            for (fapy fapyVar : faqaVar.b) {
                emoh emohVar2 = emobVar.b;
                if ((emohVar2.b & 4) != 0) {
                    emhvVar = emobVar.a.a(a.w(emohVar2.f, fapyVar.c, ":"));
                } else {
                    if (!DesugarCollections.unmodifiableMap(emohVar2.g).containsKey(fapyVar.c)) {
                        throw new IOException("No local file for action: ".concat(String.valueOf(fapyVar.c)));
                    }
                    emhu emhuVar = (emhu) emhv.a.createBuilder();
                    String str = (String) DesugarCollections.unmodifiableMap(emobVar.b.g).get(fapyVar.c);
                    emhuVar.copyOnWrite();
                    emhv emhvVar2 = (emhv) emhuVar.instance;
                    str.getClass();
                    emhvVar2.b |= 2;
                    emhvVar2.d = str;
                    emhvVar = (emhv) emhuVar.build();
                }
                try {
                    InputStream f = emobVar.a.f(emhvVar);
                    try {
                        fapx fapxVar = (fapx) fapyVar.toBuilder();
                        eyee B = eyee.B(f);
                        fapxVar.copyOnWrite();
                        fapy fapyVar2 = (fapy) fapxVar.instance;
                        B.getClass();
                        fapyVar2.b |= 4;
                        fapyVar2.d = B;
                        fapy fapyVar3 = (fapy) fapxVar.build();
                        fapzVar.copyOnWrite();
                        faqa faqaVar2 = (faqa) fapzVar.instance;
                        fapyVar3.getClass();
                        eygr eygrVar = faqaVar2.b;
                        if (!eygrVar.c()) {
                            faqaVar2.b = eyfy.mutableCopy(eygrVar);
                        }
                        faqaVar2.b.add(fapyVar3);
                        if (f != null) {
                            f.close();
                        }
                    } catch (Throwable th) {
                        if (f == null) {
                            throw th;
                        }
                        try {
                            f.close();
                            throw th;
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                            throw th;
                        }
                    }
                } catch (Exception e) {
                    throw new IOException(e);
                }
            }
            faqa faqaVar3 = (faqa) fapzVar.build();
            long nativeLoadActionFrame = ActionFrameManager.nativeLoadActionFrame(emobVar.c.a, faqaVar3.toByteArray());
            if (nativeLoadActionFrame == 0) {
                throw new IllegalArgumentException("Couldn't create action_frame from the provided ActionSetConfig");
            }
            ActionFrame actionFrame = new ActionFrame(nativeLoadActionFrame);
            eygr<emoe> eygrVar2 = emohVar.e;
            Pattern pattern = emoa.a;
            enin eninVar = new enin();
            eniq eniqVar = new eniq();
            for (emoe emoeVar : eygrVar2) {
                String str2 = emoeVar.b;
                eninVar.c(str2);
                Iterator<E> it = emoeVar.c.iterator();
                while (it.hasNext()) {
                    eniqVar.b((String) it.next(), str2);
                }
                Iterator<E> it2 = emoeVar.d.iterator();
                while (it2.hasNext()) {
                    eniqVar.b((String) it2.next(), str2);
                }
            }
            eninVar.c("CONTACT");
            eninVar.c("ADDRESS");
            eninVar.c("MONEY");
            eninVar.c("ACNUMBER");
            eninVar.c("PERCENTAGE");
            eninVar.c("COUPON");
            eninVar.c("DATE");
            eninVar.c("DATE_TIME");
            eninVar.c("TIMELIKE");
            eninVar.c("TIME");
            return new emoc(emohVar, tagger, actionFrame, new emoa(eninVar.g(), eniqVar.a()), z);
        } catch (Exception e2) {
            throw new emlq("Could not initialize Pumpkin model!", e2);
        }
    }

    static String d(String str) {
        return str.isEmpty() ? str : str.replaceAll("[\n!?.,;:\\(\\)\\{\\}\\[\\]\"/\\-\\\\+\\\\*%@&_]", " ");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:178:0x04b1  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x04be  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x04cb A[SYNTHETIC] */
    @Override // defpackage.emnk
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.engw a(defpackage.fbup r25, java.lang.String r26, defpackage.emrk r27) {
        /*
            Method dump skipped, instructions count: 1296
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.emoc.a(fbup, java.lang.String, emrk):engw");
    }

    @Override // defpackage.emnk
    public final /* synthetic */ void b() {
    }
}
