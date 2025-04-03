package defpackage;

import android.content.Context;
import androidx.compose.ui.platform.ComposeView;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.replies.snippet.RepliedToDataAdapter;
import j$.util.function.Consumer$CC;
import java.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ajva implements ajuq {
    public static final entd a = entd.c("BugleReplies");
    public final ffbr b;
    public final ffbr c;
    public final elew d;
    public final crly e;

    public ajva(ffbr ffbrVar, ffbr ffbrVar2, elew elewVar, crly crlyVar) {
        this.b = ffbrVar;
        this.c = ffbrVar2;
        this.d = elewVar;
        this.e = crlyVar;
        crlyVar.f(R.layout.reply_snippet_view);
    }

    @Override // defpackage.ajuq
    public final void a(final StringBuilder sb, RepliedToDataAdapter repliedToDataAdapter) {
        if (repliedToDataAdapter == null) {
            return;
        }
        final Context context = ((ComposeView) this.e.b()).getContext();
        repliedToDataAdapter.b(new ffji() { // from class: ajus
            @Override // defpackage.ffji
            public final Object invoke(Object obj) {
                int a2;
                ajso ajsoVar = (ajso) obj;
                ajsoVar.getClass();
                ajrt ajrtVar = ajsoVar.e;
                if (ajrtVar == null) {
                    ajrtVar = ajrt.a;
                }
                Context context2 = context;
                StringBuilder sb2 = sb;
                if ((ajrtVar.b & 1) != 0) {
                    ajrt ajrtVar2 = ajsoVar.e;
                    if (ajrtVar2 == null) {
                        ajrtVar2 = ajrt.a;
                    }
                    if ((ajrtVar2.b & 2) != 0) {
                        int length = sb2.length();
                        ajrt ajrtVar3 = ajsoVar.e;
                        if (ajrtVar3 == null) {
                            ajrtVar3 = ajrt.a;
                        }
                        ajrw ajrwVar = ajrtVar3.d;
                        if (ajrwVar == null) {
                            ajrwVar = ajrw.a;
                        }
                        ajva ajvaVar = this;
                        ajrwVar.getClass();
                        String str = ajvaVar.c(ajrwVar).a;
                        ajrt ajrtVar4 = ajsoVar.e;
                        if (ajrtVar4 == null) {
                            ajrtVar4 = ajrt.a;
                        }
                        ajrw ajrwVar2 = ajrtVar4.c;
                        if (ajrwVar2 == null) {
                            ajrwVar2 = ajrw.a;
                        }
                        ajrwVar2.getClass();
                        sb2.replace(0, length, context2.getString(R.string.message_with_reply_snippet_talk_back_announcement, sb2, str, ajvaVar.c(ajrwVar2).a));
                        return ffcu.a;
                    }
                }
                ajrt ajrtVar5 = ajsoVar.e;
                if (((ajrtVar5 == null ? ajrt.a : ajrtVar5).b & 2) != 0) {
                    if (ajrtVar5 == null) {
                        ajrtVar5 = ajrt.a;
                    }
                    ajrw ajrwVar3 = ajrtVar5.d;
                    if (ajrwVar3 == null) {
                        ajrwVar3 = ajrw.a;
                    }
                    if (ajrwVar3.b == 2 && (a2 = ajto.a(((Integer) ajrwVar3.c).intValue())) != 0 && a2 == 4) {
                        sb2.replace(0, sb2.length(), context2.getString(R.string.message_with_deleted_snippet_talk_back_announcement, sb2));
                    }
                }
                return ffcu.a;
            }
        });
    }

    @Override // defpackage.ajuq
    public final void b(RepliedToDataAdapter repliedToDataAdapter, final boolean z, final Boolean bool) {
        if (repliedToDataAdapter != null) {
            this.e.g(0);
            ((ComposeView) this.e.b()).setImportantForAccessibility(2);
            repliedToDataAdapter.b(new ffji() { // from class: ajuw
                @Override // defpackage.ffji
                public final Object invoke(Object obj) {
                    final ajso ajsoVar = (ajso) obj;
                    ajsoVar.getClass();
                    ensk n = ajva.a.n();
                    ensn ensnVar = ajro.a;
                    n.Y(ajro.c, ajsoVar.c);
                    n.q("ReplySnippetControllerImpl.setContent");
                    final ajva ajvaVar = ajva.this;
                    ((ComposeView) ajvaVar.e.b()).a(new hpw(1064301283, true, new ajuz(ajvaVar, ajsoVar, z, ajvaVar.d.a("ReplySnippet.onDismissClick", new ffix() { // from class: ajut
                        @Override // defpackage.ffix
                        public final Object invoke() {
                            ellj.g(new ajuo(bdhb.b(ajso.this.c)), ajvaVar.e.b());
                            return ffcu.a;
                        }
                    }), bool)));
                    return ffcu.a;
                }
            });
        } else {
            a.n().q("ReplySnippetControllerImpl.setContent with null data");
            crly crlyVar = this.e;
            final ffji ffjiVar = new ffji() { // from class: ajuu
                @Override // defpackage.ffji
                public final Object invoke(Object obj) {
                    ComposeView composeView = (ComposeView) obj;
                    entd entdVar = ajva.a;
                    composeView.getClass();
                    composeView.setVisibility(8);
                    return ffcu.a;
                }
            };
            crlyVar.d(new Consumer() { // from class: ajuv
                @Override // java.util.function.Consumer
                public final void accept(Object obj) {
                    entd entdVar = ajva.a;
                    ffji.this.invoke(obj);
                }

                public final /* synthetic */ Consumer andThen(Consumer consumer) {
                    return Consumer$CC.$default$andThen(this, consumer);
                }
            });
        }
    }

    public final ajvh c(ajrw ajrwVar) {
        String string;
        int i = ajrwVar.b;
        int i2 = 2;
        if (i != 2) {
            if (i == 3) {
                String str = ((ajsm) ajrwVar.c).b;
                str.getClass();
                return new ajvh(str);
            }
            if (i != 1) {
                throw new IllegalArgumentException("Snippet content is not set");
            }
            String str2 = (String) ajrwVar.c;
            str2.getClass();
            return new ajvh(str2);
        }
        Context context = ((ComposeView) this.e.b()).getContext();
        if (ajrwVar.b == 2 && (i2 = ajto.a(((Integer) ajrwVar.c).intValue())) == 0) {
            i2 = 1;
        }
        switch (i2 - 2) {
            case -1:
                throw new IllegalStateException("Reply snippet uiString should never be UNRECOGNIZED");
            case 0:
            default:
                throw new IllegalStateException("Reply snippet uiString should never be STRING_UNSPECIFIED");
            case 1:
                string = context.getString(R.string.snippet_self_participant_header);
                break;
            case 2:
                string = context.getString(R.string.snippet_deleted_message_text);
                break;
            case 3:
                string = context.getString(R.string.snippet_image_attachment_text);
                break;
            case 4:
                string = context.getString(R.string.snippet_audio_attachment_text);
                break;
            case 5:
                throw new IllegalStateException("Reply snippet uiString should never be ENTITY_ASSISTANT_CARD");
            case 6:
                string = context.getString(R.string.snippet_video_attachment_text);
                break;
            case 7:
                string = context.getString(R.string.snippet_file_attachment_text);
                break;
        }
        string.getClass();
        return new ajvh(string, 1);
    }
}
