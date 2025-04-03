package defpackage;

import android.app.Activity;
import android.content.Context;
import com.google.android.apps.messaging.conversation.messagelist.ConversationStartRowView;
import com.google.android.apps.messaging.conversation.messagelist.ConversationStartView;
import com.google.android.apps.messaging.conversation.messagelist.tombstone.ConversationTombstoneView;
import com.google.android.apps.messaging.conversation.reactions.ui.selection.ReactionSelectionRecyclerView;
import com.google.android.apps.messaging.conversation.reactions.ui.summary.ReactionsSummaryRecyclerView;
import com.google.android.apps.messaging.conversation.settings.BusinessContactActionView;
import com.google.android.apps.messaging.conversation.settings.BusinessTopActionView;
import com.google.android.apps.messaging.conversation.settings.ConversationSettingsOptionItemView;
import com.google.android.apps.messaging.diagnostics.sensor.ui.TakeBugReportDialogView;
import com.google.android.apps.messaging.helpandfeedback.advancedfeedback.ui.AdvancedFeedbackDataView;
import com.google.android.apps.messaging.popup.federatedlearning.FederatedLearningPopupView;
import com.google.android.apps.messaging.popup.spam.SpamPopupView;
import com.google.android.apps.messaging.shared.audio.attachment.ui.AudioPlaybackSeekBar;
import com.google.android.apps.messaging.shared.audio.attachment.ui.PausableChronometer;
import com.google.android.apps.messaging.shared.ui.AsyncImageView;
import com.google.android.apps.messaging.shared.ui.ContactIconView;
import com.google.android.apps.messaging.ui.ImeDetectCoordinatorLayout;
import com.google.android.apps.messaging.ui.attachment.FileAttachmentView;
import com.google.android.apps.messaging.ui.attachment.VCardAttachmentView;
import com.google.android.apps.messaging.ui.contact.ContactListItemView;
import com.google.android.apps.messaging.ui.conversation.AudioButtonView;
import com.google.android.apps.messaging.ui.conversation.message.ConversationMessageLinkPreviewView;
import com.google.android.apps.messaging.ui.conversation.message.ConversationMessageMetadataView;
import com.google.android.apps.messaging.ui.conversation.message.ConversationMessageTransferView;
import com.google.android.apps.messaging.ui.conversation.message.ConversationMessageView;
import com.google.android.apps.messaging.ui.conversation.message.MessageAttachmentsView;
import com.google.android.apps.messaging.ui.conversation.message.MessageMetadataDetailsView;
import com.google.android.apps.messaging.ui.conversation.richcard.ConversationRichCardCarouselView;
import com.google.android.apps.messaging.ui.conversation.richcard.ConversationRichCardView;
import com.google.android.apps.messaging.ui.conversation.richcard.RichCardContentContainer;
import com.google.android.apps.messaging.ui.conversation.richcard.RichCardMediaAttachmentView;
import com.google.android.apps.messaging.ui.conversation.richcard.RichCardVideoOverlayView;
import com.google.android.apps.messaging.ui.conversation.suggestions.ConversationSuggestionsView;
import com.google.android.apps.messaging.ui.conversation.suggestions.tooltip.ConversationSuggestionsBugleTooltipView;
import com.google.android.apps.messaging.ui.conversation.toolstone.ConversationToolstoneView;
import com.google.android.apps.messaging.ui.conversation.typingindicator.ConversationTypingIndicatorView;
import com.google.android.apps.messaging.ui.ditto.QrScannerOverlayView;
import com.google.android.apps.messaging.ui.generic.spannedautocomplete.SpannedMultiAutoCompleteTextView;
import com.google.android.apps.messaging.ui.mediapicker.c2o.content.CategoryToggleView;
import com.google.android.apps.messaging.ui.mediapicker.c2o.emoji.EmojiContentItemView;
import com.google.android.apps.messaging.ui.mediapicker.c2o.expressivesticker.ExpressiveStickerContentItemView;
import com.google.android.apps.messaging.ui.mediapicker.c2o.gallery.GalleryContentItemView;
import com.google.android.apps.messaging.ui.mediapicker.c2o.gif.GifCategoryContentItemView;
import com.google.android.apps.messaging.ui.mediapicker.c2o.location.LocationContentCategoryView;
import com.google.android.apps.messaging.ui.mediapicker.c2o.selectable.SelectableContentItemView;
import com.google.android.apps.messaging.ui.mediapicker.camera.CameraTextureView;
import com.google.android.apps.messaging.ui.mediapicker.camera.MiniCameraViewImpl;
import com.google.android.apps.messaging.ui.search.ZeroStateSearchBox;
import com.google.android.apps.messaging.ui.video.VideoOverlayView;
import com.google.android.libraries.compose.emoji.ui.views.SingleEmojiView;
import com.google.android.libraries.compose.emoji.ui.views.SingleEmojiViewWithVariantIndicator;
import com.google.android.libraries.user.profile.photopicker.art.edit.EditableArtView;
import com.google.android.libraries.user.profile.photopicker.common.view.error.FullscreenErrorView;
import com.google.android.libraries.user.profile.photopicker.edit.EditablePhotoView;
import j$.util.Collection;
import j$.util.Comparator;
import j$.util.Optional;
import j$.util.function.Function$CC;
import j$.util.stream.Stream;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.function.Function;
import javax.microedition.khronos.egl.EGLContext;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class akkz extends akfn {
    final fbbf A;
    final fbbf B;
    final fbbf C;
    final fbbf D;
    final fbbf E;
    final fbbf F;
    final fbbf G;
    private final akgg H;
    private final akkz I = this;
    public final akis a;
    public final akgb b;
    final fbbf c;
    final fbbf d;
    final fbbf e;
    final fbbf f;
    final fbbf g;
    final fbbf h;
    final fbbf i;
    final fbbf j;
    final fbbf k;
    final fbbf l;
    final fbbf m;
    final fbbf n;
    final fbbf o;
    final fbbf p;
    final fbbf q;
    final fbbf r;
    final fbbf s;
    final fbbf t;
    final fbbf u;
    final fbbf v;
    final fbbf w;
    final fbbf x;
    final fbbf y;
    final fbbf z;

    public akkz(akis akisVar, akgg akggVar, akgb akgbVar) {
        this.a = akisVar;
        this.H = akggVar;
        this.b = akgbVar;
        this.c = new akky(akisVar, akggVar, akgbVar, this, 0);
        this.d = new akky(akisVar, akggVar, akgbVar, this, 1);
        this.e = new akky(akisVar, akggVar, akgbVar, this, 2);
        this.f = new akky(akisVar, akggVar, akgbVar, this, 3);
        this.g = new akky(akisVar, akggVar, akgbVar, this, 4);
        this.h = new akky(akisVar, akggVar, akgbVar, this, 5);
        this.i = new akky(akisVar, akggVar, akgbVar, this, 6);
        this.j = new akky(akisVar, akggVar, akgbVar, this, 7);
        this.k = new akky(akisVar, akggVar, akgbVar, this, 8);
        this.l = new akky(akisVar, akggVar, akgbVar, this, 9);
        this.m = new akky(akisVar, akggVar, akgbVar, this, 11);
        this.n = new akky(akisVar, akggVar, akgbVar, this, 10);
        this.o = new akky(akisVar, akggVar, akgbVar, this, 12);
        this.p = new akky(akisVar, akggVar, akgbVar, this, 13);
        this.q = new akky(akisVar, akggVar, akgbVar, this, 14);
        this.r = new akky(akisVar, akggVar, akgbVar, this, 15);
        this.s = new akky(akisVar, akggVar, akgbVar, this, 16);
        this.t = new akky(akisVar, akggVar, akgbVar, this, 17);
        this.u = new akky(akisVar, akggVar, akgbVar, this, 19);
        this.v = new akky(akisVar, akggVar, akgbVar, this, 18);
        this.w = new akky(akisVar, akggVar, akgbVar, this, 20);
        this.x = new akky(akisVar, akggVar, akgbVar, this, 21);
        this.y = new akky(akisVar, akggVar, akgbVar, this, 23);
        this.z = new akky(akisVar, akggVar, akgbVar, this, 24);
        this.A = new akky(akisVar, akggVar, akgbVar, this, 22);
        this.B = new akky(akisVar, akggVar, akgbVar, this, 25);
        this.C = new akky(akisVar, akggVar, akgbVar, this, 26);
        this.D = new akky(akisVar, akggVar, akgbVar, this, 27);
        this.E = new akky(akisVar, akggVar, akgbVar, this, 29);
        this.F = new akky(akisVar, akggVar, akgbVar, this, 30);
        this.G = new akky(akisVar, akggVar, akgbVar, this, 28);
    }

    @Override // defpackage.czwa
    public final void A(ConversationSuggestionsBugleTooltipView conversationSuggestionsBugleTooltipView) {
        conversationSuggestionsBugleTooltipView.b = (crjx) this.a.a.r.b();
    }

    @Override // defpackage.czri
    public final void B(ConversationSuggestionsView conversationSuggestionsView) {
        conversationSuggestionsView.a = (akvg) this.a.a.Px.b();
        conversationSuggestionsView.b = (adtc) this.H.bt.b();
        akgb akgbVar = this.b;
        conversationSuggestionsView.c = akgbVar.aZ;
        Context context = (Context) akgbVar.d.b();
        cstx cstxVar = (cstx) this.a.cp.b();
        adsd adsdVar = (adsd) this.a.a.fo.b();
        ctiy ctiyVar = (ctiy) this.a.jv.b();
        akis akisVar = this.a;
        fbbf fbbfVar = akisVar.aU;
        fbbf fbbfVar2 = akisVar.a.nE;
        ctyx ctyxVar = (ctyx) fbbfVar.b();
        altk altkVar = (altk) this.a.a.fP.b();
        cqoh cqohVar = (cqoh) this.a.cz.b();
        fbbf fbbfVar3 = this.H.cn;
        fbbf fbbfVar4 = this.a.a.nr;
        bbae bbaeVar = (bbae) fbbfVar3.b();
        czwl czwlVar = (czwl) this.y.b();
        dede dedeVar = (dede) this.a.b.iq.b();
        fbbf fbbfVar5 = this.a.aJ;
        conversationSuggestionsView.d = new czqm(context, cstxVar, adsdVar, ctiyVar, fbbfVar2, ctyxVar, altkVar, cqohVar, fbbfVar4, bbaeVar, czwlVar, dedeVar, fbaz.a(this.b.be), (elbx) fbbfVar5.b(), this.z, this.a.b.lp);
        conversationSuggestionsView.e = (Optional) this.a.a.RQ.b();
    }

    @Override // defpackage.czwx
    public final void C(ConversationToolstoneView conversationToolstoneView) {
        akis akisVar = this.a;
        conversationToolstoneView.a = akisVar.b.pT;
        akkp akkpVar = akisVar.a;
        conversationToolstoneView.b = akkpVar.vK;
        conversationToolstoneView.c = this.C;
        conversationToolstoneView.d = akkpVar.sA;
    }

    @Override // defpackage.czyd
    public final void D(ConversationTypingIndicatorView conversationTypingIndicatorView) {
        conversationTypingIndicatorView.e = (azze) this.a.a.fx.b();
        conversationTypingIndicatorView.f = this.a.kk;
    }

    @Override // defpackage.efww
    public final void E(EditableArtView editableArtView) {
        editableArtView.s = this.b.au();
        editableArtView.t = (dvxi) this.a.b.jA.b();
    }

    @Override // defpackage.egkd
    public final void F(EditablePhotoView editablePhotoView) {
        editablePhotoView.q = ((egko) ((lmw) this.b.cl.b()).a(egko.class)).f;
        editablePhotoView.r = (dvxi) this.a.b.jA.b();
    }

    @Override // defpackage.dcbz
    public final void G(EmojiContentItemView emojiContentItemView) {
        emojiContentItemView.d = (crjx) this.a.a.r.b();
    }

    @Override // defpackage.dsjg
    public final void H(dsjf dsjfVar) {
        dsjfVar.c = (dqmx) this.G.b();
        dsjfVar.d = (dsma) this.b.bx.b();
    }

    @Override // defpackage.dccr
    public final void I(ExpressiveStickerContentItemView expressiveStickerContentItemView) {
        expressiveStickerContentItemView.d = (csmj) this.a.b.le.b();
        expressiveStickerContentItemView.a = (cxqk) this.b.bn.b();
        expressiveStickerContentItemView.b = (elbx) this.a.aJ.b();
    }

    @Override // defpackage.cxns
    public final void J(FileAttachmentView fileAttachmentView) {
        fileAttachmentView.h = (cxqh) this.a.a.af.b();
    }

    @Override // defpackage.egjh
    public final void K(FullscreenErrorView fullscreenErrorView) {
        fullscreenErrorView.d = (dvyc) this.a.b.jx.b();
        fullscreenErrorView.e = (dvxi) this.a.b.jA.b();
    }

    @Override // defpackage.dcga
    public final void L(GalleryContentItemView galleryContentItemView) {
        galleryContentItemView.d = (csmj) this.a.b.le.b();
        galleryContentItemView.c = (elbx) this.a.aJ.b();
    }

    @Override // defpackage.dciy
    public final void M(GifCategoryContentItemView gifCategoryContentItemView) {
        gifCategoryContentItemView.b = (cxqk) this.b.bn.b();
    }

    @Override // defpackage.cris
    public final void N(criq criqVar) {
        criqVar.g = (errl) this.a.ps.b();
        criqVar.h = fbaz.a(this.a.a.vS);
        criqVar.i = this.a.a.al;
    }

    @Override // defpackage.cwpd
    public final void O(ImeDetectCoordinatorLayout imeDetectCoordinatorLayout) {
        akis akisVar = this.a;
        imeDetectCoordinatorLayout.j = new cwpg(akisVar.b.iq, akisVar.a.nk);
        imeDetectCoordinatorLayout.k = (tam) this.b.m.b();
    }

    @Override // defpackage.dcjx
    public final void P(LocationContentCategoryView locationContentCategoryView) {
        locationContentCategoryView.d = (cxqk) this.b.bn.b();
    }

    @Override // defpackage.czky
    public final void Q(MessageAttachmentsView messageAttachmentsView) {
        messageAttachmentsView.e = (cxqh) this.a.a.af.b();
    }

    @Override // defpackage.czln
    public final void R(MessageMetadataDetailsView messageMetadataDetailsView) {
        messageMetadataDetailsView.c = (cuxh) this.a.a.ae.b();
        messageMetadataDetailsView.d = this.a.a.lI();
        messageMetadataDetailsView.e = (csjk) this.a.a.el.b();
        messageMetadataDetailsView.f = (csrh) this.a.a.xi.b();
        messageMetadataDetailsView.g = (cuye) this.a.a.ff.b();
        messageMetadataDetailsView.s = (bzyb) this.a.cH.b();
        messageMetadataDetailsView.h = this.a.a.ej;
        messageMetadataDetailsView.i = (ddxs) this.n.b();
        messageMetadataDetailsView.j = this.a.a.Px;
    }

    @Override // defpackage.dcqv
    public final void S(MiniCameraViewImpl miniCameraViewImpl) {
        miniCameraViewImpl.c = (ctud) this.a.cT.b();
        akis akisVar = this.a;
        miniCameraViewImpl.d = new alci(akisVar.a.dF, new alcs(), (Executor) akisVar.p.b());
        miniCameraViewImpl.e = (dcoz) this.a.b.pD.b();
        miniCameraViewImpl.f = (errl) this.a.ps.b();
        miniCameraViewImpl.g = (cxqk) this.b.bn.b();
        miniCameraViewImpl.h = (ddzb) this.a.a.nk.b();
        miniCameraViewImpl.i = (elbx) this.a.aJ.b();
        miniCameraViewImpl.j = this.D;
        miniCameraViewImpl.k = this.a.a.f;
    }

    @Override // defpackage.ardh
    public final void T(PausableChronometer pausableChronometer) {
        pausableChronometer.a = (cqoh) this.a.cz.b();
    }

    @Override // defpackage.egxk
    public final void U(egvy egvyVar) {
        egvyVar.g = this.a.b.dP();
        egvyVar.d = (dvyu) this.a.b.jz.b();
        Activity activity = (Activity) this.b.d.b();
        activity.getClass();
        egvyVar.h = new egse(activity);
        egvyVar.e = (dvxi) this.a.b.jA.b();
    }

    @Override // defpackage.dbsm
    public final void V(QrScannerOverlayView qrScannerOverlayView) {
        qrScannerOverlayView.a = (cuxh) this.a.a.ae.b();
    }

    @Override // defpackage.czpc
    public final void W(RichCardContentContainer richCardContentContainer) {
        richCardContentContainer.g = (crjx) this.a.a.r.b();
        richCardContentContainer.h = (azzw) this.a.b.lb.b();
        richCardContentContainer.i = this.A;
    }

    @Override // defpackage.czpk
    public final void X(RichCardMediaAttachmentView richCardMediaAttachmentView) {
        akis akisVar = this.a;
        akkp akkpVar = akisVar.a;
        richCardMediaAttachmentView.c = akkpVar.tD;
        richCardMediaAttachmentView.d = akkpVar.f;
        richCardMediaAttachmentView.e = akisVar.b.le;
        richCardMediaAttachmentView.f = this.B;
    }

    @Override // defpackage.czpr
    public final void Y(RichCardVideoOverlayView richCardVideoOverlayView) {
        richCardVideoOverlayView.c = (altk) this.a.a.fP.b();
        richCardVideoOverlayView.d = (akvg) this.a.a.Px.b();
        richCardVideoOverlayView.e = this.a.b.cr();
        richCardVideoOverlayView.f = this.a.a.xi;
    }

    @Override // defpackage.dclu
    public final void Z(SelectableContentItemView selectableContentItemView) {
        selectableContentItemView.d = (csmj) this.a.b.le.b();
    }

    @Override // defpackage.uqf
    public final void a(ConversationStartRowView conversationStartRowView) {
        conversationStartRowView.b = (azze) this.a.a.fx.b();
        conversationStartRowView.c = (crji) this.a.a.ab.b();
    }

    @Override // defpackage.dqyo
    public final void aa(SingleEmojiView singleEmojiView) {
        singleEmojiView.e = (ffsk) this.a.a.p.b();
    }

    @Override // defpackage.dqyn
    public final void ab(SingleEmojiViewWithVariantIndicator singleEmojiViewWithVariantIndicator) {
        singleEmojiViewWithVariantIndicator.e = (ffsk) this.a.a.p.b();
    }

    @Override // defpackage.dbxb
    public final void ac(SpannedMultiAutoCompleteTextView spannedMultiAutoCompleteTextView) {
        spannedMultiAutoCompleteTextView.a = this.a.aJ;
    }

    @Override // defpackage.cxoj
    public final void ad(VCardAttachmentView vCardAttachmentView) {
        vCardAttachmentView.a = (axul) this.a.b.id.b();
        akis akisVar = this.a;
        vCardAttachmentView.b = new bcye(akisVar.q, this.h, akisVar.a.ab, akisVar.dB, akisVar.b.ma);
        vCardAttachmentView.c = (cuxh) this.a.a.ae.b();
        vCardAttachmentView.d = (cxqh) this.a.a.af.b();
        vCardAttachmentView.e = this.a.a.Z;
    }

    @Override // defpackage.deac
    public final void ae(VideoOverlayView videoOverlayView) {
        videoOverlayView.d = this.a.b.cx();
        videoOverlayView.e = this.a.a.xi;
    }

    @Override // defpackage.ddmv
    public final void af(ZeroStateSearchBox zeroStateSearchBox) {
        zeroStateSearchBox.i = this.b.dg;
        zeroStateSearchBox.j = (dede) this.a.b.iq.b();
        zeroStateSearchBox.k = (ddpl) this.a.b.N.b();
        zeroStateSearchBox.l = (elbx) this.a.aJ.b();
        zeroStateSearchBox.m = this.a.b.kZ;
    }

    @Override // defpackage.cwqo
    public final void am() {
    }

    @Override // defpackage.cylz
    public final void an() {
    }

    @Override // defpackage.ddot
    public final void ao() {
    }

    @Override // defpackage.uqh
    public final void b(ConversationStartView conversationStartView) {
        conversationStartView.b = this.H.bt;
        conversationStartView.c = (altk) this.a.a.fP.b();
        conversationStartView.d = this.c;
    }

    @Override // defpackage.uxr
    public final void c(ConversationTombstoneView conversationTombstoneView) {
        conversationTombstoneView.d = (bcsf) this.a.a.vK.b();
        conversationTombstoneView.e = (csrh) this.a.a.xi.b();
        conversationTombstoneView.f = this.a.a.Px;
        conversationTombstoneView.g = (vyw) this.b.E.b();
        conversationTombstoneView.h = fbaz.a(this.b.be);
        conversationTombstoneView.i = this.d;
        conversationTombstoneView.j = fbaz.a(this.e);
        conversationTombstoneView.k = this.a.a.ii;
    }

    @Override // defpackage.vgr
    public final void d(ReactionSelectionRecyclerView reactionSelectionRecyclerView) {
        reactionSelectionRecyclerView.ad = (vfc) this.a.b.lc.b();
        reactionSelectionRecyclerView.ae = (elbx) this.a.aJ.b();
        reactionSelectionRecyclerView.af = cmqp.a((alcb) this.a.b.hI.b(), this.a.b.ig.b());
        reactionSelectionRecyclerView.ag = (cmsl) this.a.lY.b();
    }

    @Override // defpackage.vje
    public final void e(ReactionsSummaryRecyclerView reactionsSummaryRecyclerView) {
        reactionsSummaryRecyclerView.ad = new vjd(new vin(this.a.a.ae, this.b.U));
    }

    @Override // defpackage.vzc
    public final void f(BusinessContactActionView businessContactActionView) {
        businessContactActionView.a = (altk) this.a.a.fP.b();
        businessContactActionView.b = (ddzb) this.a.a.nk.b();
    }

    @Override // defpackage.vzd
    public final void g(BusinessTopActionView businessTopActionView) {
        businessTopActionView.b = (altk) this.a.a.fP.b();
        businessTopActionView.c = (ddzb) this.a.a.nk.b();
    }

    @Override // defpackage.vzy
    public final void h(ConversationSettingsOptionItemView conversationSettingsOptionItemView) {
        conversationSettingsOptionItemView.e = (bcuo) this.f.b();
        conversationSettingsOptionItemView.f = (ellq) this.a.b.oJ.b();
    }

    @Override // defpackage.achd
    public final void i(TakeBugReportDialogView takeBugReportDialogView) {
        takeBugReportDialogView.f = (acex) this.a.b.qa.b();
        takeBugReportDialogView.e = (ellq) this.a.b.oJ.b();
    }

    @Override // defpackage.adwr
    public final void j(AdvancedFeedbackDataView advancedFeedbackDataView) {
        advancedFeedbackDataView.k = (ellq) this.a.b.oJ.b();
    }

    @Override // defpackage.ajio
    public final void k(FederatedLearningPopupView federatedLearningPopupView) {
        federatedLearningPopupView.a = (akvg) this.a.a.Px.b();
        federatedLearningPopupView.b = (adtc) this.H.bt.b();
        federatedLearningPopupView.c = (elbx) this.a.aJ.b();
    }

    @Override // defpackage.ajix
    public final void l(SpamPopupView spamPopupView) {
        spamPopupView.c = this.a.a.Px;
        spamPopupView.d = this.H.bt;
    }

    final czpo m() {
        return new czpo((Context) this.a.q.b());
    }

    @Override // defpackage.crhl
    public final void n(AsyncImageView asyncImageView) {
        asyncImageView.e = (csmj) this.a.b.le.b();
        asyncImageView.f = (cbbu) this.a.dB.b();
        asyncImageView.g = (ekyo) this.b.T.b();
    }

    @Override // defpackage.cxrs
    public final void o(AudioButtonView audioButtonView) {
        audioButtonView.f = (cqoh) this.a.cz.b();
        audioButtonView.g = (ctcy) this.a.nZ.b();
        audioButtonView.h = (cxxp) this.i.b();
        audioButtonView.i = (arby) this.j.b();
        audioButtonView.j = this.a.O();
        audioButtonView.k = (errl) this.a.ps.b();
        audioButtonView.l = (errl) this.a.t.b();
        audioButtonView.m = (errm) this.a.p.b();
        audioButtonView.n = this.a.cT;
        audioButtonView.o = this.b.g;
        audioButtonView.p = (aldm) this.k.b();
        audioButtonView.q = (aldr) this.l.b();
        audioButtonView.r = (ddzb) this.a.a.nk.b();
        audioButtonView.s = (bcwz) this.a.a.ad.b();
        audioButtonView.t = (alcb) this.a.b.hI.b();
        akis akisVar = this.a;
        audioButtonView.u = akisVar.nY;
        audioButtonView.v = akisVar.aJ;
    }

    @Override // defpackage.arde
    public final void p(AudioPlaybackSeekBar audioPlaybackSeekBar) {
        audioPlaybackSeekBar.a = (cqoh) this.a.cz.b();
    }

    @Override // defpackage.dcpj
    public final void q(CameraTextureView cameraTextureView) {
        cameraTextureView.c = (dcoz) this.a.b.pD.b();
        cameraTextureView.d = Optional.of((Executor) this.a.b.pB.b());
        cameraTextureView.e = Optional.of((EGLContext) this.a.b.pC.b());
        cameraTextureView.f = (ctud) this.a.cT.b();
    }

    @Override // defpackage.dcaa
    public final void r(CategoryToggleView categoryToggleView) {
        categoryToggleView.e = (cxqk) this.b.bn.b();
    }

    @Override // defpackage.crhs
    public final void s(ContactIconView contactIconView) {
        contactIconView.e = (csmj) this.a.b.le.b();
        contactIconView.f = (cbbu) this.a.dB.b();
        contactIconView.g = (ekyo) this.b.T.b();
        contactIconView.q = Optional.of((axul) this.a.b.id.b());
        contactIconView.r = (crji) this.a.a.ab.b();
        akkp akkpVar = this.a.a;
        contactIconView.s = new crhv(akkpVar.fP, this.H.k, akkpVar.hP, akkpVar.ib, this.g);
        contactIconView.t = this.a.a.Z;
    }

    @Override // defpackage.cxrg
    public final void t(ContactListItemView contactListItemView) {
        contactListItemView.i = (albq) this.a.a.di.b();
        contactListItemView.j = this.a.a.eO();
        contactListItemView.k = (ellq) this.a.b.oJ.b();
        contactListItemView.l = this.a.a.Z;
    }

    @Override // defpackage.czht
    public final void u(ConversationMessageLinkPreviewView conversationMessageLinkPreviewView) {
        conversationMessageLinkPreviewView.b = (bdxd) this.a.a.pY.b();
        conversationMessageLinkPreviewView.c = (bdwr) this.a.a.rn.b();
        conversationMessageLinkPreviewView.d = (Optional) this.a.a.jb.b();
        conversationMessageLinkPreviewView.e = (akvg) this.a.a.Px.b();
        conversationMessageLinkPreviewView.f = (vyw) this.b.E.b();
        new dedg(this.a.a.nk);
        akis akisVar = this.a;
        conversationMessageLinkPreviewView.g = akisVar.a.ii;
        conversationMessageLinkPreviewView.h = akisVar.cy;
    }

    @Override // defpackage.czib
    public final void v(ConversationMessageMetadataView conversationMessageMetadataView) {
        conversationMessageMetadataView.b = (csmj) this.a.b.le.b();
        conversationMessageMetadataView.c = fbaz.a(this.b.be);
        conversationMessageMetadataView.d = this.d;
    }

    @Override // defpackage.czjh
    public final void w(ConversationMessageTransferView conversationMessageTransferView) {
        conversationMessageTransferView.c = (bcsf) this.a.a.vK.b();
        conversationMessageTransferView.d = this.a.a.lI();
        conversationMessageTransferView.e = (cxqh) this.a.a.af.b();
        conversationMessageTransferView.f = (elbx) this.a.aJ.b();
        akis akisVar = this.a;
        conversationMessageTransferView.g = akisVar.cI;
        conversationMessageTransferView.h = akisVar.lz;
    }

    @Override // defpackage.czkp
    public final void x(ConversationMessageView conversationMessageView) {
        conversationMessageView.z = (albq) this.a.a.di.b();
        conversationMessageView.A = (csmj) this.a.b.le.b();
        conversationMessageView.B = (crjx) this.a.a.r.b();
        conversationMessageView.C = (crji) this.a.a.ab.b();
        conversationMessageView.D = (cuye) this.a.a.ff.b();
        akis akisVar = this.a;
        akkp akkpVar = akisVar.a;
        fbbf fbbfVar = akisVar.q;
        fbbf fbbfVar2 = akkpVar.ja;
        fbbf fbbfVar3 = akisVar.cp;
        fbbf fbbfVar4 = akkpVar.jb;
        fbbf fbbfVar5 = akkpVar.ff;
        akko akkoVar = akisVar.b;
        fbbf fbbfVar6 = this.n;
        fbbf fbbfVar7 = akkoVar.lb;
        fbbf fbbfVar8 = akisVar.p;
        fbbf fbbfVar9 = akkpVar.af;
        fbbf fbbfVar10 = akkpVar.fP;
        fbbf fbbfVar11 = akkpVar.ap;
        akgb akgbVar = this.b;
        fbbf fbbfVar12 = akgbVar.be;
        conversationMessageView.E = new czje(fbbfVar, fbbfVar2, fbbfVar3, fbbfVar4, fbbfVar5, fbbfVar6, fbbfVar7, fbbfVar8, fbbfVar9, akgbVar.E, fbbfVar10, fbbfVar11, akisVar.cI, fbbg.a(fbbfVar12), this.d, akkpVar.ii, this.b.dm, this.o, akisVar.gH, this.p, akisVar.cz, this.q);
        conversationMessageView.F = (adsd) this.a.a.fo.b();
        conversationMessageView.G = (ddxs) this.n.b();
        conversationMessageView.H = (cxqh) this.a.a.af.b();
        conversationMessageView.I = (bcsf) this.a.a.vK.b();
        conversationMessageView.J = (vyw) this.b.E.b();
        conversationMessageView.K = (cqoh) this.a.cz.b();
        akis akisVar2 = this.a;
        conversationMessageView.L = akisVar2.a.t;
        conversationMessageView.M = (ellq) akisVar2.b.oJ.b();
        conversationMessageView.N = Optional.of(this.a.b.cu());
        conversationMessageView.O = fbaz.a(this.b.be);
        conversationMessageView.P = this.d;
        conversationMessageView.Q = this.r;
        conversationMessageView.R = new czko(Optional.of(this.a.b.cu()));
        conversationMessageView.S = new czhk(this.s);
        akgb akgbVar2 = this.b;
        tve tveVar = tve.CALENDAR_BADGE;
        cztn cztnVar = new cztn();
        akis akisVar3 = akgbVar2.b;
        tve tveVar2 = tve.REACTION_BADGE;
        Stream map = Collection.EL.stream(enhk.p(tveVar, cztnVar, tveVar2, new vfh(), tve.STAR_BADGE, new wfi(), tve.REMINDER_BADGE, new ddkq(), tve.SCHEDULED_SEND_BADGE, new akqd()).entrySet()).sorted(Comparator.CC.comparing(new Function() { // from class: tuz
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((tve) ((Map.Entry) obj).getKey()).h;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        })).map(new Function() { // from class: tva
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return (tuy) ((Map.Entry) obj).getValue();
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        int i = engw.d;
        engw engwVar = (engw) map.collect(endq.a);
        engwVar.getClass();
        conversationMessageView.T = engwVar;
        conversationMessageView.U = this.a.a.lI();
        conversationMessageView.V = this.t;
        akkp akkpVar2 = this.a.a;
        conversationMessageView.W = akkpVar2.Df;
        conversationMessageView.aa = fbaz.a(akkpVar2.ap);
        conversationMessageView.ab = this.a.a.gp;
        conversationMessageView.ac = fbaz.a(this.v);
        akis akisVar4 = this.a;
        conversationMessageView.ad = akisVar4.p;
        conversationMessageView.ae = this.w;
        conversationMessageView.af = this.x;
        akkp akkpVar3 = akisVar4.a;
        conversationMessageView.ag = akkpVar3.go;
        conversationMessageView.ah = akkpVar3.xi;
    }

    @Override // defpackage.czoo
    public final void y(ConversationRichCardCarouselView conversationRichCardCarouselView) {
        conversationRichCardCarouselView.af = (bcsf) this.a.a.vK.b();
        conversationRichCardCarouselView.ag = m();
    }

    @Override // defpackage.czop
    public final void z(ConversationRichCardView conversationRichCardView) {
        conversationRichCardView.n = (crjx) this.a.a.r.b();
        conversationRichCardView.o = (cgrq) this.a.a.pS.b();
        conversationRichCardView.p = (bcsf) this.a.a.vK.b();
        conversationRichCardView.q = m();
        conversationRichCardView.r = (cqoh) this.a.cz.b();
        conversationRichCardView.s = this.a.a.pR;
    }

    @Override // defpackage.akps
    public final void ag() {
    }

    @Override // defpackage.cztu
    public final void ah() {
    }

    @Override // defpackage.cztw
    public final void ai() {
    }

    @Override // defpackage.cxnt
    public final void aj() {
    }

    @Override // defpackage.cxnz
    public final void ak() {
    }

    @Override // defpackage.czpn
    public final void al() {
    }
}
