package defpackage;

import android.R;
import android.content.Context;
import android.graphics.Canvas;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dsjf extends dsjh {
    static final /* synthetic */ ffmx[] a;
    private static final enru r;
    public final jse b;
    public dqmx c;
    public dsma d;
    public jzn e;
    public final ffls f;
    public final ffls g;
    public final ffls h;
    public final ffls i;
    public final ffls j;
    public final ffls k;
    public final ffls l;
    public final ffls m;
    public boolean n;
    public boolean o;
    public final ffls p;
    public final ffls q;
    private final ffbz s;
    private boolean t;

    static {
        ffko ffkoVar = new ffko(dsjf.class, "textStyle", "getTextStyle$java_com_google_android_libraries_compose_ui_composable_text_emoji_text_field_AUTO_DEPS_ORIGINAL()Landroidx/compose/ui/text/TextStyle;", 0);
        int i = fflc.a;
        a = new ffmx[]{ffkoVar, new ffko(dsjf.class, "layoutDirection", "getLayoutDirection$java_com_google_android_libraries_compose_ui_composable_text_emoji_text_field_AUTO_DEPS_ORIGINAL()Landroidx/compose/ui/unit/LayoutDirection;", 0), new ffko(dsjf.class, "keyboardOptions", "getKeyboardOptions$java_com_google_android_libraries_compose_ui_composable_text_emoji_text_field_AUTO_DEPS_ORIGINAL()Landroidx/compose/foundation/text/KeyboardOptions;", 0), new ffko(dsjf.class, "keyboardActions", "getKeyboardActions$java_com_google_android_libraries_compose_ui_composable_text_emoji_text_field_AUTO_DEPS_ORIGINAL()Landroidx/compose/foundation/text/KeyboardActions;", 0), new ffko(dsjf.class, "verticalPadding", "getVerticalPadding-D9Ej5fM$java_com_google_android_libraries_compose_ui_composable_text_emoji_text_field_AUTO_DEPS_ORIGINAL()F", 0), new ffko(dsjf.class, "minHeight", "getMinHeight-D9Ej5fM$java_com_google_android_libraries_compose_ui_composable_text_emoji_text_field_AUTO_DEPS_ORIGINAL()F", 0), new ffko(dsjf.class, "maxHeight", "getMaxHeight-D9Ej5fM$java_com_google_android_libraries_compose_ui_composable_text_emoji_text_field_AUTO_DEPS_ORIGINAL()F", 0), new ffko(dsjf.class, "maxLength", "getMaxLength$java_com_google_android_libraries_compose_ui_composable_text_emoji_text_field_AUTO_DEPS_ORIGINAL()Ljava/lang/Integer;", 0), new ffko(dsjf.class, "placeholder", "getPlaceholder$java_com_google_android_libraries_compose_ui_composable_text_emoji_text_field_AUTO_DEPS_ORIGINAL()Lcom/google/android/libraries/compose/ui/composable/text/TextPlaceholder;", 0), new ffko(dsjf.class, "hasExplicitFocus", "getHasExplicitFocus$java_com_google_android_libraries_compose_ui_composable_text_emoji_text_field_AUTO_DEPS_ORIGINAL()Ljava/lang/Boolean;", 0)};
        r = enru.c("com/google/android/libraries/compose/ui/composable/text/EmojiTextFieldView");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dsjf(Context context, jse jseVar) {
        super(context);
        jseVar.getClass();
        this.b = jseVar;
        this.s = ffca.a(new ffix() { // from class: dsiu
            @Override // defpackage.ffix
            public final Object invoke() {
                dsjf dsjfVar = dsjf.this;
                dqmx dqmxVar = dsjfVar.c;
                if (dqmxVar == null) {
                    ffkj.c("draftControllerFactory");
                    dqmxVar = null;
                }
                return dqmxVar.a(dsjfVar);
            }
        });
        this.f = new dsiw(jpo.a, this);
        this.g = new dsix(this);
        this.h = new dsiy(euw.a, this);
        this.i = new dsiz(euv.a, this);
        this.j = new dsja(new jzq(Float.NaN), this);
        this.k = new dsjb(new jzq(Float.NaN), this);
        this.l = new dsjc(new jzq(Float.NaN), this);
        this.m = new dsjd(this);
        this.p = new dsje(this);
        this.q = new dsiv(this);
    }

    public final jzn b() {
        jzn jznVar = this.e;
        if (jznVar != null) {
            return jznVar;
        }
        ffkj.c("density");
        return null;
    }

    public final dqmw c() {
        return (dqmw) this.s.a();
    }

    public final dsma d() {
        dsma dsmaVar = this.d;
        if (dsmaVar != null) {
            return dsmaVar;
        }
        ffkj.c("keyboardManager");
        return null;
    }

    public final Boolean e() {
        return (Boolean) this.q.c(a[9]);
    }

    public final void f() {
        dsmm d = d().d();
        if (d == dsmm.a || d == dsmm.b) {
            d().e(this, true);
        }
    }

    public final void g() {
        dsmm d = d().d();
        if (d == dsmm.d || d == dsmm.c) {
            d().f(this, false);
        }
    }

    @Override // defpackage.lfj, defpackage.qw, android.widget.TextView, android.view.View
    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        editorInfo.getClass();
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        onCreateInputConnection.getClass();
        if (!ffkj.e(e(), true)) {
            if (ffkj.e(e(), false)) {
                f();
            }
            return onCreateInputConnection;
        }
        if (!hasFocus()) {
            requestFocus();
        }
        g();
        return onCreateInputConnection;
    }

    @Override // android.widget.TextView, android.view.View
    protected final void onDraw(Canvas canvas) {
        canvas.getClass();
        if (!this.o) {
            super.onDraw(canvas);
            return;
        }
        try {
            super.onDraw(canvas);
            if (this.t) {
                enrr enrrVar = (enrr) r.j();
                enrrVar.aa(ensy.FULL);
                ((enrr) enrrVar.h("com/google/android/libraries/compose/ui/composable/text/EmojiTextFieldView", "onDraw", 330, "HugoEmojiTextField.kt")).q("Recovered from NPE");
                this.t = false;
            }
        } catch (NullPointerException e) {
            this.t = true;
            if (getLayout() == null && getHint() == null) {
                ((enrr) ((enrr) r.i()).g(e).h("com/google/android/libraries/compose/ui/composable/text/EmojiTextFieldView", "onDraw", 336, "HugoEmojiTextField.kt")).q("null hint & layout");
                return;
            }
            if (getLayout() != null && getHint() == null) {
                ((enrr) ((enrr) r.i()).g(e).h("com/google/android/libraries/compose/ui/composable/text/EmojiTextFieldView", "onDraw", 337, "HugoEmojiTextField.kt")).q("null hint");
                return;
            }
            if (getLayout() == null && getHint() != null) {
                ((enrr) ((enrr) r.i()).g(e).h("com/google/android/libraries/compose/ui/composable/text/EmojiTextFieldView", "onDraw", 338, "HugoEmojiTextField.kt")).q("null layout");
            } else {
                if (getLayout() == null || getHint() == null) {
                    return;
                }
                ((enrr) ((enrr) r.i()).g(e).h("com/google/android/libraries/compose/ui/composable/text/EmojiTextFieldView", "onDraw", 339, "HugoEmojiTextField.kt")).q("No null");
            }
        }
    }

    @Override // defpackage.qw, android.widget.EditText, android.widget.TextView
    public final boolean onTextContextMenuItem(int i) {
        if (i == 16908322) {
            if (this.n) {
                return super.onTextContextMenuItem(R.id.pasteAsPlainText);
            }
            i = 16908322;
        }
        return super.onTextContextMenuItem(i);
    }
}
